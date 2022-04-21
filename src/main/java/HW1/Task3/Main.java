package HW1.Task3;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Area of the square is " + square.area(5.8));

        Circle circle = new Circle();
        System.out.println("Area of the circle is " + circle.area(3));

        Triangle triangle = new Triangle(2);
        System.out.println("Area of the triangle is " + triangle.area(3));
    }
}
