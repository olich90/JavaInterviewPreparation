package HW1.Task3;

public class Triangle extends Figure {
    private final double h;

    public Triangle(double h) {
        this.h = h;
    }

    @Override
    public double area(double hypotenuse) {
        return hypotenuse * h / 2;
    }
}
