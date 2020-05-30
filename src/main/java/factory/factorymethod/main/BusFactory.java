package factory.factorymethod.main;


public class BusFactory implements IFactory {
    @Override
    public Car getCar() {
        return new Bus();
    }
}
