package observer;


import java.util.Observable;
import java.util.Observer;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Observe implements Observer {

    private Market market;

    public Observe(Market market) {
        this.market = market;
        market.registerObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getClass().getName() + market.getUpdateInfo());
    }
}
