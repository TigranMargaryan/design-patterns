package Flyweight;
import static org.junit.Assert.*;
import org.junit.Test;

public class FlyweightTest {
    @Test
    public void testFlyweight() {

        Flyweight flyweight1 = FlyweightFactory.getFlyweight("key1", "value1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("key2", "value2");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("key1", "value3");

        Flyweight unsharedFlyweight1 = FlyweightFactory.getFlyweight("unsharedKey1",
                "value1");
        Flyweight unsharedFlyweight2 = FlyweightFactory.getFlyweight("unsharedKey2",
                "value2");
        Flyweight unsharedFlyweight3 = FlyweightFactory.getFlyweight("unsharedKey1",
                "value3");

        assertNotEquals(flyweight1, flyweight2);
        assertEquals(flyweight1, flyweight3);
        assertNotEquals(flyweight2, flyweight3);

        assertNotEquals(unsharedFlyweight1, unsharedFlyweight2);
        assertNotEquals(unsharedFlyweight1, unsharedFlyweight3);
        assertNotEquals(unsharedFlyweight2, unsharedFlyweight3);

    }
}
