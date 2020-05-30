package adapter;

import lombok.Data;

/**
 * @author Jackey
 * @date 2020/5/30
 */
@Data
public class GalaxyS7 {

    private MicroUsbInterface microUsbInterface;

    public GalaxyS7() {
    }

    public GalaxyS7(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge() {
        System.out.println("开始给我的GalaxyS7手机充电...");
        microUsbInterface.chargeWithMicroUsb();
        System.out.println("开始给我的GalaxyS7手机充电...");
    }


}
