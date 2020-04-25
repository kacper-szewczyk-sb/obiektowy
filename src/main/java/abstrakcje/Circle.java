package abstrakcje;

public class Circle extends Figure {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }


    @Override
    public Double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public Double calculateCircuit() {
        return 2 * Math.PI * radius;
    }
}
