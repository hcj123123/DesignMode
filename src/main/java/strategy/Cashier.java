package strategy;

import java.math.BigDecimal;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Cashier {

    private Member member;

    public Cashier(Member member) {
        this.member = member;
    }

    /**
     * @Description 计算应付价格
     * @Param [booksPrice]
     * @Return java.math.BigDecimal
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 21:44
     */
    public BigDecimal cal(BigDecimal booksPrice) {
        return this.member.calPrice(booksPrice);
    }

}
