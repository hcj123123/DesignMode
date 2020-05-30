package adapter;

import lombok.Data;


/**
 * @author Jackey
 * @date 2020/5/30
 */

@Data
public class Adapter implements LightningInterface {


    private MicroUsbInterface microUsbInterface;

    public Adapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;

    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }


}
