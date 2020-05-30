package observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author Jackey
 * @date 2020/5/30
 */


public class Market implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String goods;

    private BigDecimal prices;

    public void updateGoods(String goods, BigDecimal prices) {
        this.goods = goods;
        this.prices = prices;
        notifyObserver();
    }


    public String getUpdateInfo() {
        return "商品名:" + goods + "\n价格" + prices;
    }


    @Override
    public void registerObserver(Observer observable) {
        observers.add(observable);
    }

    @Override
    public void removeObserver(Observer observable) {
        observers.remove(observable);
    }

    @Override
    public void notifyObserver() {
        for (Observer obserber : observers
        ) {
            obserber.update(null, null);
        }
    }
}
