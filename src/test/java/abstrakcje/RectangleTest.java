package abstrakcje;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void circuitTest() {
        Figure rectangle = new Rectangle(4.0,6.0);

        Assertions.assertEquals(20.0,
                rectangle.calculateCircuit(), "Obwód powinien wynieść 20");

        Figure rectangle2 = new Rectangle(2.0, 10.0);

        Assertions.assertEquals(24.0,
                rectangle2.calculateCircuit(), "Obwód powinien wynieść 24");
    }

    @Test
    public void areaTest() {
        Figure rectangle = new Rectangle(4.0, 6.0);

        Assertions.assertEquals(24.0,
                rectangle.calculateArea(), "Pole powinno wynosić 24");

        Figure rectangle2 = new Rectangle(0.0, 100.0);

        Assertions.assertEquals(0.0,
                rectangle2.calculateArea(), "Pole powinno wynosić 0");
    }
}
