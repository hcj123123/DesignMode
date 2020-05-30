package adapter;


/**
 * @author Jackey
 * @date 2020/5/30
 */
public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lightning型号的充电器充电...");
    }
}
