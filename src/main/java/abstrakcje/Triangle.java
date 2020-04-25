package abstrakcje;

public class Triangle extends Figure {
    private Double a;
    private Double b;
    private Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public Double calculateArea() {
        Double halfCircuit = calculateCircuit() / 2.0;

        return Math.sqrt(halfCircuit * (halfCircuit - a) * (halfCircuit - b) * (halfCircuit - c));
    }

    @Override
    public Double calculateCircuit() {
        return a + b + c;
    }
}
