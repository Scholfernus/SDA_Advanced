package org.example.ZadaniaProgramAdvancedPDF.Exc3;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean fillShape, double radius) {
        super(color, fillShape);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (double) (Math.PI * radius * radius);
    }

    public double getPerimeter() {
        return (double) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
