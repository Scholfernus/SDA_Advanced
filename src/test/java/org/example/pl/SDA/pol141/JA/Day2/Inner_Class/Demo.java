package org.example.pl.SDA.pol141.JA.Day2.Inner_Class;

public class Demo {
    private String message;
    class Point{
        private double x;
        private double y;

        public Point() {
            message = "12";
        }
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        Point point = demo.new Point();
        point.x = 10;
        System.out.println(demo.message);
        // przykład klasy lokalnej
        class Shape{
            int color;
            double width;
            double height;
        }
        Shape shape = new Shape();
        shape.color = 4589;
        Shape[] shapes = new Shape[]{
                new Shape(), new Shape()
        };
    }

}
