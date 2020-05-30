package factory.simplefactory.pay;


@PayService(channel = "unionPay")
public class UnionPay implements Pay {
    @Override
    public Object pay(String str) {
        return null;
    }

    @Override
    public String toString() {
        return "UnionPay{}";
    }
}
