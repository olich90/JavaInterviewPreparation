package HW1.Task3;

public class Square extends Figure {

    @Override
    public double area(double side) {
        return Math.pow(side, 2);
    }
}
