package adapter;


import lombok.Data;

/**
 * @author Jackey
 * @date 2020/5/30
 */

@Data
public class Iphone6Plus {

    private LightningInterface lightningInterface;

    public Iphone6Plus() {
    }

    public Iphone6Plus(LightningInterface appleCharger) {
        this.lightningInterface = appleCharger;
    }

    public void charge() {
        System.out.println("开始给我的Iphone6Plus手机充电...");
        lightningInterface.chargeWithLightning();
        System.out.println("结束给我的Iphone6Plus手机充电...");
    }


}
