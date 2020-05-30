package factory.factorymethod.main;


public class Bike implements Car {
    @Override
    public void run() {
        System.out.println("我是自行车");
    }
}
