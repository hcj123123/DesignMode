package factory.simplefactory.pay;


@PayService(channel = "wxPay")
public class WxPay implements Pay {
    @Override
    public Object pay(String str) {
        return null;
    }

    @Override
    public String toString() {
        return "WxPay{}";
    }
}
