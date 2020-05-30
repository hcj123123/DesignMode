package decoration;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class DecoratrMain {
    public static void main(String[] args) {
        Coffee coffee = new Decaf();
        coffee.cost();
        coffee = new Mocha(coffee);
        coffee.cost();
        coffee = new Sugar(coffee);
        System.out.println("一共: " + coffee.cost() + "元");
    }
}
