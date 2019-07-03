package bridge;

import static org.junit.Assert.*;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void testBuilder() {

        RefinedAbstraction refinedAbstractionA = new RefinedAbstraction(
                new ConcreteImplementorA());
        assertEquals("bridge.ConcreteImplementorA",
                refinedAbstractionA.operation());

        RefinedAbstraction refinedAbstractionB = new RefinedAbstraction(
                new ConcreteImplementorB());
        assertEquals("bridge.ConcreteImplementorB",
                refinedAbstractionB.operation());
    }
}
