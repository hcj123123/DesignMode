package adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();

        logger.info("==============================");


        GalaxyS7 galaxyS7 = new GalaxyS7(new AndroidCharger());
        galaxyS7.charge();

        logger.info("==============================");

        Adapter adapter = new Adapter(new AndroidCharger());
        Iphone6Plus newIphone = new Iphone6Plus();
        newIphone.setLightningInterface(adapter);
        newIphone.charge();

    }

}
