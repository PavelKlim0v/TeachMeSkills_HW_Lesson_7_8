package com.teachmeskills.lesson_7_8.task_1.vector;

import java.util.Objects;

public class Vector2D extends AbstractVector implements IVector {

    public Vector2D(double x, double y) {
        super(x,y);
    }

    @Override
    public double lengthVector() {
        double lengthV = Math.sqrt((x * x) + (y * y));
        return lengthV;
    }

    @Override
    public String toString() {
        return "Vector2D: (x=" + x +", y="+ y +")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Vector2D vector1 = (Vector2D) object;
        return Double.compare(vector1.x, x) == 0 && Double.compare(vector1.y, y) == 0;
    }

}