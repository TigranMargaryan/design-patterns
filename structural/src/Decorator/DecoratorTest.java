package Decorator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Component component = new ConcreteComponent();

        Decorator decoratorA = new ComponentDecoratorA();

        decoratorA.setComponent(component);
        decoratorA.operation();

        assertEquals(true, ((ComponentDecoratorA) decoratorA).isState());

        Decorator decoratorB = new ComponentDecoratorB();
        decoratorB.setComponent(component);

        assertEquals(false,
                ((ComponentDecoratorB) decoratorB).isBehaviorMethodInvoked());

        decoratorB.operation();

        assertEquals(true,
                ((ComponentDecoratorB) decoratorB).isBehaviorMethodInvoked());
    }

}