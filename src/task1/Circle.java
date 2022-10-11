package task1;

public class Circle implements Shape {

    private final double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.radius * PI;
    }
}
