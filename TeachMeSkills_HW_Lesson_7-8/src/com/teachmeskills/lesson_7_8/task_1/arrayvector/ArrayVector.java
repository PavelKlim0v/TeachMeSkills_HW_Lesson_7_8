package com.teachmeskills.lesson_7_8.task_1.arrayvector;

import com.teachmeskills.lesson_7_8.task_1.vector.AbstractVector;
import com.teachmeskills.lesson_7_8.task_1.vector.Vector2D;
import com.teachmeskills.lesson_7_8.task_1.vector.Vector3D;
import java.util.Arrays;
import java.util.Random;

public class ArrayVector {

    private static AbstractVector rand() {
        Random rand = new Random();
        AbstractVector vector;
        if (rand.nextBoolean()) {
            vector = new Vector2D(rand.nextInt(10) + 1,rand.nextInt(10) + 1);
        } else {
            vector = new Vector3D(rand.nextInt(10) + 1,rand.nextInt(10) + 1,rand.nextInt(10 + 1));
        }
        return vector;
    }

    public static String generateArrayVector(int enterNumber) {
        AbstractVector[] arrayVector = new AbstractVector[enterNumber];

        for (int i = 0; i < arrayVector.length; i++) {
            arrayVector[i] = rand();
            System.out.println(arrayVector[i]);
        }
        return Arrays.toString(arrayVector);
    }

}
