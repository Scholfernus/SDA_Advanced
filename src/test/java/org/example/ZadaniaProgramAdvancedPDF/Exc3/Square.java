package org.example.ZadaniaProgramAdvancedPDF.Exc3;

public class Square extends Rectangle{
    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, Boolean fillShape, double width, double length) {
        super(color, fillShape, width, length);
    }

    public Square() {
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
