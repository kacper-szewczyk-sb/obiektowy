package abstrakcje;

import org.junit.jupiter.api.Assertions;

public class TriangleTest {

    @org.junit.jupiter.api.Test
    public void circuitTest() {
        Figure triangle = new Triangle(3.0,4.0,5.0);
        // assert statements
        Assertions.assertEquals(12.0, triangle.calculateCircuit(), "Obwód powinien wynieść 12");
    }

    @org.junit.jupiter.api.Test
    public void areaTest() {
        Figure triangle = new Triangle(3.0,4.0,5.0);
        // assert statements
        Assertions.assertEquals(6.0, triangle.calculateArea(), "Pole powinien wynieść 6");
    }
}
