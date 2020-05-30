package builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jackey
 * @date 2020/5/30
 */


public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Builder commonBuilder = new CommonRoleBuilder();
        Director director = new Director(commonBuilder);
        director.construct();

        Role result = commonBuilder.getResult();
        logger.info("结果为:{}", result);
    }
}
