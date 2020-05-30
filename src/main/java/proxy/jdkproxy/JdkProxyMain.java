package proxy.jdkproxy;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class JdkProxyMain {

    public static void main(String[] args) {
        Fruit fruit = new Apple();
        //代理对象，将目标对象注入
        JdkProxy jdkProxy = new JdkProxy(fruit);
        Fruit res = (Fruit) jdkProxy.getProxyInstance();
        //通过代理对象调用目标对象方法
        res.eat();
    }


}
