package com.teachmeskills.lesson_7_8.task_1.vector;

import java.util.Objects;

public class Vector3D extends AbstractVector implements IVector {

    private double z;

    public Vector3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double lengthVector() {
        double lengthV = Math.sqrt((x * x) + (y * y) + (z * z));
        return lengthV;
    }

    @Override
    public String toString() {
        return "Vector3D: (x=" + x +", y=" + y +", z=" + z +")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y,z);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Vector3D vector = (Vector3D) object;
        return Double.compare(vector.x,x) == 0 && Double.compare(vector.y,y) == 0 && Double.compare(vector.z,z) == 0;
    }

}
