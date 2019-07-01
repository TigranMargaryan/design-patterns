package builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void testBuilder(){
        ConcreteBuilder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        director.construct();

        Product product = builder.getResult();

        assertEquals(product.getPart1(), "part1");
        assertEquals(product.getPart2(), "part2");
    }
}
