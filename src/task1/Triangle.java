package task1;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;                              // полупериметр
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c)); // формула Герона
    }

    @Override
    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }
}
