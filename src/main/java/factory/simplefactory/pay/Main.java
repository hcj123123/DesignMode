package factory.simplefactory.pay;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pay pay = Factory.getPayMethod("aliPay");
        // 调用pay的方法完成支付功能
        pay.pay("");
        payAction("wxPay");
        payAction("unionPay");
        payAction("aliPay");
    }

    public static void payAction(String channel) {
        Pay pay = PayFactory.getInstance().getPay(channel);
        System.out.println(pay);

        Map<String, Object> map = new HashMap<>();

    }
}
