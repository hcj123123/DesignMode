package strategy;

import java.math.BigDecimal;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public interface Member {


    /**
     * @Description 计算应付的价格
     * @Param [bookPrice]
     * @Return BigDecimal
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 21:08
     */
    public BigDecimal calPrice(BigDecimal bookPrice);

}
