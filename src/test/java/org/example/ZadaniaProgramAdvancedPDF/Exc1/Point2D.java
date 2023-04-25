package org.example.ZadaniaProgramAdvancedPDF.Exc1;

public class Point2D {
    protected float x, y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 20);
        point2D.setXY(43, 65);
        System.out.println(point2D);
        Point3D point3D = new Point3D(10, 20, 30);
        point3D.setXYZ(43, 64, 2);
        System.out.println(point3D);
    }
}
