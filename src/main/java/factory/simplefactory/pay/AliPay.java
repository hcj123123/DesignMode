package factory.simplefactory.pay;


@PayService(channel = "aliPay")
public class AliPay implements Pay {

    @Override
    public Object pay(String str) {
        return null;
    }

    @Override
    public String toString() {
        return "AliPay{}";
    }
}
