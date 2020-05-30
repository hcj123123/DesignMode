package decoration;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Decaf implements Coffee {


    public Decaf() {
        System.out.println("一杯浓咖啡，8元");
    }

    @Override
    public double cost() {
        return 8.0d;
    }
}
