package decoration;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Espresso implements Coffee {

    public Espresso() {
        System.out.println("一杯浓咖啡，10元");
    }

    @Override
    public double cost() {
        return 10.0d;
    }
}
