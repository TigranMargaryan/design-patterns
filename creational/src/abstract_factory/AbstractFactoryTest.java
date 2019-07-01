package abstract_factory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory(){

        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        assertEquals("abstract_factory.ProductA",
                factory1.createProductA().getClass().getName());
        assertEquals("abstract_factory.ProductB2",
                factory2.createProductB().getClass().getName());

        assertEquals("abstract_factory.ProductA",
                factory1.createProductA().getClass().getName());
        assertEquals("abstract_factory.ProductB2",
                factory2.createProductB().getClass().getName());
    }
}
