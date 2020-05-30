package factory.abstractfactory.main;


public class FactoryA implements IFactory {

    @Override
    public Cpu createCpu() {
        return new ACpu();
    }

    @Override
    public Screen createScreen() {
        return new AScreen();
    }
}
