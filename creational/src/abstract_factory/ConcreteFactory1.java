package abstract_factory;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB();
    }
}
