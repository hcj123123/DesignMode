package decoration;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Sugar extends Decorator {

    public Sugar(Coffee coffee) {
        super(coffee);
        System.out.println("加糖，2元");
    }

    @Override
    public double cost() {
        return super.cost() + 2.0d;
    }
}
