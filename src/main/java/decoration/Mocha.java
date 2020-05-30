package decoration;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Mocha extends Decorator {

    public Mocha(Coffee coffee) {
        super(coffee);
        System.out.println("加摩卡，3元");
    }

    @Override
    public double cost() {
        return super.cost() + 3.0d;
    }
}
