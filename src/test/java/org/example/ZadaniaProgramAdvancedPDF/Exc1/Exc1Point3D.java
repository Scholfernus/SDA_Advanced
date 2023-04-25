package org.example.ZadaniaProgramAdvancedPDF.Exc1;

import org.example.ZadaniaProgramAdvancedPDF.Exc1.Exc1Point2D;

public class Exc1Point3D extends Exc1Point2D {
    private float z;

    public Exc1Point3D(float z) {
        this.z = z;
    }

    public Exc1Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Exc1Point3D{" +
                "z=" + z +
                '}';
    }
}
