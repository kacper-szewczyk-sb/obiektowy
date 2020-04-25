package abstrakcje;

public class Rectangle extends Figure {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return width * height;
    }

    @Override
    public Double calculateCircuit() {
        return 2 * (width + height);
    }

}
