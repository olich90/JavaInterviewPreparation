package HW1.Task3;

public class Circle extends Figure {

    @Override
    public double area(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
}
