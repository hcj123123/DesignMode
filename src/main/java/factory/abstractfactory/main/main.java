package factory.abstractfactory.main;


public class main {

    public static void main(String[] args) {

        FactoryA factoryA = new FactoryA();
        factoryA.createCpu();
        factoryA.createScreen();
        FactoryB factoryB = new FactoryB();
        factoryB.createCpu();
        factoryB.createScreen();


    }
}
