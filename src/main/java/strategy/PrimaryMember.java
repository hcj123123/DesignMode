package strategy;

import java.math.BigDecimal;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class PrimaryMember implements Member {


    @Override
    public BigDecimal calPrice(BigDecimal bookPrice) {
        System.out.println("对于初级会员的没有折扣");
        return bookPrice;
    }
}
