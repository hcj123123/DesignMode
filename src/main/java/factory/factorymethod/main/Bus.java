package factory.factorymethod.main;


public class Bus implements Car {
    @Override
    public void run() {
        System.out.println("我是公交车");
    }
}
