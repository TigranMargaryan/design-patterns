package Proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProxyTest {

    @Test
    public void testProxy() {

        Proxy proxy = new Proxy();

        // realSubject is not created yet, therefore we expect null
        assertEquals(null, proxy.getRealSubject());

        proxy.doOperation();

        assertNotNull(proxy.getRealSubject());
    }
}
