package singleton.lazysingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class LazySingletonTest {

    @Test
    public void testSingleton(){

        LazySingleton instance = LazySingleton.getInstance();

        assertNotNull(instance);

        LazySingleton instanceTwo = LazySingleton.getInstance();

        assertEquals(instance, instanceTwo);

        System.out.println(instanceTwo);
        System.out.println(instance);

    }
}
