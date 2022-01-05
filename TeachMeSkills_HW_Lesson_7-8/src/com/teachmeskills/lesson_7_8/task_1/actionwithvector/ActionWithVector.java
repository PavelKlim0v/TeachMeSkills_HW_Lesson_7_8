package com.teachmeskills.lesson_7_8.task_1.actionwithvector;

import com.teachmeskills.lesson_7_8.task_1.vector.IVector;
import com.teachmeskills.lesson_7_8.task_1.vector.Vector2D;
import com.teachmeskills.lesson_7_8.task_1.vector.Vector3D;

public class ActionWithVector {

    public static double scalarProductVector(IVector point2,IVector point4) {
        if (point2 instanceof Vector2D && point4 instanceof Vector2D) {
            return (point2.getX() * point4.getX() + point2.getY() * point4.getY());
        } else if (point2 instanceof Vector3D && point4 instanceof Vector3D) {
            return (point2.getX() * point4.getX() + point2.getY() * point4.getY() + ((Vector3D) point2).getZ() * ((Vector3D) point4).getZ());
        } else {
            return 0;
        }
    }

    public static IVector subtractionVector(IVector point2,IVector point4) {
        if (point2 instanceof Vector2D && point4 instanceof Vector2D) {
            double subtractionX = point2.getX() - point4.getX();
            double subtractionY = point2.getY() - point4.getY();
            IVector vectorNew = new Vector2D(subtractionX, subtractionY);
            return vectorNew;
        } else if (point2 instanceof Vector3D && point4 instanceof Vector3D) {
            double subtractionX = point2.getX() - point4.getX();
            double subtractionY = point2.getY() - point4.getY();
            double subtractionZ = ((Vector3D) point2).getZ() - ((Vector3D) point4).getZ();
            IVector vectorNew = new Vector3D(subtractionX, subtractionY, subtractionZ);
            return vectorNew;
        } else {
            return null;
        }
    }

    public static IVector additionVector(IVector point2,IVector point4) {
        if (point2 instanceof Vector2D && point4 instanceof Vector2D) {
            double additionX = point2.getX() + point4.getX();
            double additionY = point2.getY() + point4.getY();
            IVector vectorNew = new Vector2D(additionX, additionY);
            return vectorNew;
        } else if (point2 instanceof Vector3D && point4 instanceof Vector3D) {
            double additionX = point2.getX() + point4.getX();
            double additionY = point2.getY() + point4.getY();
            double additionZ = ((Vector3D) point2).getZ() + ((Vector3D) point4).getZ();
            IVector vectorNew = new Vector3D(additionX, additionY, additionZ);
            return vectorNew;
        } else {
            return null;
        }
    }

}
