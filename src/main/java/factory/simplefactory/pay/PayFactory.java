package factory.simplefactory.pay;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PayFactory {

    private PayFactory() {

    }

    private static class Holder {
        private static PayFactory payFactory = new PayFactory();
    }

    private Map<String, Pay> payCahe;

    public static PayFactory getInstance() {
        return Holder.payFactory;
    }

    public Pay getPay(String channel) {
        if (payCahe == null || payCahe.isEmpty()) {
            this.setPayCache();
        }
        return payCahe.get(channel);
    }

    private synchronized void setPayCache() {

        if (payCahe != null && !payCahe.isEmpty()) {
            return;
        }
        payCahe = new HashMap<String, Pay>(16);
        //通过包名及目标类对象获取到该包下所有的支付服务类对象，注意下面这步只是获取到了该包下的Pay以及Pay的子类，但是我们只需要Pay的子类，因此还要做过滤
        Set<Class<Pay>> clazzs = PackageUtil.getPackageClasses("factory.simplefactory.pay", Pay.class);
        for (Class<Pay> pay : clazzs) {
            PayService annotation = pay.getAnnotation(PayService.class);
            if (annotation == null) {
                // 过滤掉没有注解的
                continue;
            }
            String[] channel = annotation.channel();
            for (String name : channel) {
                try {
                    payCahe.put(name, pay.getConstructor().newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
