package factory.abstractfactory.main;


public class FactoryB implements IFactory {


    @Override
    public Cpu createCpu() {
        return new BCpu();
    }

    @Override
    public Screen createScreen() {
        return new BScreen();
    }
}
