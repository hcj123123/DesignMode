package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Main {


    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        /**
         * 选择并创建需要使用的策略对象
         */
        Member strategy = new AdvancedMember();


        Cashier cashier = new Cashier(strategy);

        /**
         * 计算价格
         */
        BigDecimal quote = cashier.cal(new BigDecimal(300));

        logger.info("高级会员图书的最终价格为：{}", quote);

        strategy = new IntermediateMember();
        cashier = new Cashier(strategy);
        quote = cashier.cal(new BigDecimal(300));
        logger.info("中级会员图书的最终价格为：{}", quote);

    }

}
