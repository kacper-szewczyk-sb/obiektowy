package abstrakcje;

import org.junit.jupiter.api.Assertions;

public class CircleTest {

    @org.junit.jupiter.api.Test
    public void circuitTest() {
        Figure circle = new Circle(1.0);
        // assert statements
        Assertions.assertEquals(2.0 * Math.PI, circle.calculateCircuit(), "Obwód powinien wynieść 12");
    }

    @org.junit.jupiter.api.Test
    public void areaTest() {
        Figure circle = new Circle(1.0);
        // assert statements
        Assertions.assertEquals(Math.PI, circle.calculateArea(), "Pole powinien wynieść 6");
    }
}
