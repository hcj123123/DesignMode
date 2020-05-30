package factory.factorymethod.main;


public class BikeFactory implements IFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }
}
