package decoration;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Decorator implements Coffee {


    private Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
