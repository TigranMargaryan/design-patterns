package prototype;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class PrototypeTest {

    @Test
    public void testPrototype() throws CloneNotSupportedException {

        Prototype prototype = new ConcretePrototype();

        Client client = new Client(prototype);

        Prototype prototypeClone = client.operation();

        assertNotEquals(prototype, prototypeClone);

    }

    }
