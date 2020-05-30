package observer;

import java.util.Observer;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public interface Subject {

    void registerObserver(Observer observable);

    void removeObserver(Observer observable);

    void notifyObserver();
}
