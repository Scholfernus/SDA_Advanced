package org.example.ZadaniaProgramAdvancedPDF.Exc3;

import org.w3c.dom.ls.LSOutput;

abstract class Shape {
    private String color;
    private Boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, Boolean fillShape) {
        this.color = color;
        this.isFilled = fillShape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setFilled(Boolean isFilled) {
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fillShape=" + isFilled +
                '}';
    }

    public static void main(String[] args) {


        Shape[] shape = {
                new Circle("Blue", true, 10),
                new Rectangle(15, 25),
                new Square(25, 35)};
        System.out.println(shape);
        Shape circle = new Circle("blue", true, 10);
        System.out.println(circle);
        Shape rectangle = new Rectangle("Yellow", true, 15, 20);
        System.out.println(rectangle);
        Shape square = new Square("green", false, 40, 15);
        System.out.println(square);
    }
}
