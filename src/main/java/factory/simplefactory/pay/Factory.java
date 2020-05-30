package factory.simplefactory.pay;


public class Factory {

    public static final String ALI_PAY = "aliPay";
    public static final String WX_PAY = "wxPay";
    public static final String UNION_PAY = "unionPay";


    /**
     * @param payMethod 支付方式
     * @return
     */
    public static Pay getPayMethod(String payMethod) {
        Pay pay = null;
        if (payMethod.equals(ALI_PAY)) {
            pay = new AliPay();
        } else if (payMethod.equals(WX_PAY)) {
            pay = new WxPay();
        } else if (payMethod.equals(UNION_PAY)) {
            pay = new UnionPay();
        } else {
            // 其他支付方式...，做相应处理
        }
        return pay;
    }

}
