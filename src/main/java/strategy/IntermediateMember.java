package strategy;

import java.math.BigDecimal;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class IntermediateMember implements Member {
    @Override
    public BigDecimal calPrice(BigDecimal bookPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return bookPrice.multiply(new BigDecimal(0.9));
    }
}
