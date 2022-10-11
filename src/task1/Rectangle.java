package task1;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return this.a * this.b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.a + this.b);
    }
}
