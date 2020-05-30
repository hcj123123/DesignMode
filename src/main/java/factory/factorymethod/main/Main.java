package factory.factorymethod.main;


public class Main {


    public static void main(String[] args) {

        IFactory factory;

        factory = new BikeFactory();
        Car bike = factory.getCar();
        bike.run();

        factory = new BusFactory();
        Car bus = factory.getCar();
        bus.run();
    }
}
