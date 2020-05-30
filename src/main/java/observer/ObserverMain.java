package observer;

import java.math.BigDecimal;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class ObserverMain {
    public static void main(String[] args) {
        Market market = new Market();
        Observe observer = new Observe(market);
        market.updateGoods("牛肉", BigDecimal.valueOf(3.5));
        market.removeObserver(observer);
        market.updateGoods("牛肉", BigDecimal.valueOf(3.6));
        market.registerObserver(observer);
        market.updateGoods("牛肉", BigDecimal.valueOf(3.7));
    }
}
