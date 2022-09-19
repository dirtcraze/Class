package Zadanie7;

public class Circle {
    private final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return this.PI * this.radius * this.radius;
    }

    public double diameter() {
        return this.radius * 2;
    }

    public double circumference() {
        return 2 * this.PI * this.radius;
    }
}
