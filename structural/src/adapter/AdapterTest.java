package adapter;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void testAdapter() {

        Target target = new Adapter();

        assertEquals("specialRequest", target.request());
    }
}
