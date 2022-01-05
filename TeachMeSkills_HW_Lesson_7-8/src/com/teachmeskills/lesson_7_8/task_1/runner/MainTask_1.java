package com.teachmeskills.lesson_7_8.task_1.runner;

import com.teachmeskills.lesson_7_8.task_1.actionwithvector.ActionWithVector;
import com.teachmeskills.lesson_7_8.task_1.arrayvector.ArrayVector;
import com.teachmeskills.lesson_7_8.task_1.vector.Vector2D;
import com.teachmeskills.lesson_7_8.task_1.vector.Vector3D;
import java.util.Scanner;

/**
 *  Задание 1. (Основное задание)
 *    Создайте класс, который описывает вектор в двумерной системе координат.
 * 	  Создайте класс, который описывает вектор в трехмерной системе координат.
 * 	  У каждого класса должны быть:
 * 		 -конструктор с параметрами в виде списка координат (например, x, y, z);
 * 		 -метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
 * 		 -метод, вычисляющий скалярное произведение;
 * 		 -метод сложения векторов;
 * 		 -метод разности векторов;
 * 		 -статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * 	  Предусмотреть сравнение векторов через метод equals.
 * 	  Вывести информацию о векторе используя метод toString.
 *
 *  Задание 2. (Дополнительное задание)
 *    Предыдущее задание обобщить и написать один класс Vector для произвольной размерности.
 * 	  Для этого в классе вектор для хранения координат следует использовать массив.
 */

public class MainTask_1 {

    public static void main(String[] args) {
        Vector2D vector_a = new Vector2D(5,6);
        Vector2D vector_b = new Vector2D(7,-5);
        Vector2D vector_c = new Vector2D(7,-5);
        Vector3D vector_v = new Vector3D(1,2,3);
        Vector3D vector_w = new Vector3D(3,-1,3);

        System.out.println("Length vector a: "+ vector_a.lengthVector());
        System.out.println("Length vector w: "+ vector_w.lengthVector());

        System.out.println("Scalar product a and b: "+ ActionWithVector.scalarProductVector(vector_a,vector_b));
        System.out.println("Addition vectors a and b: "+ ActionWithVector.additionVector(vector_a,vector_b));
        System.out.println("Subtraction vectors a and b: "+ ActionWithVector.subtractionVector(vector_a,vector_b));

        System.out.println("Scalar product v and w: "+ ActionWithVector.scalarProductVector(vector_v,vector_w));
        System.out.println("Addition vectors v and w: "+ ActionWithVector.additionVector(vector_v,vector_w));
        System.out.println("Subtraction vectors v and w: "+ ActionWithVector.subtractionVector(vector_v,vector_w));

        if (vector_b.equals(vector_c)) {
            System.out.println("They are equals.");
        } else {
            System.out.println("They are not equals.");
        }

        if (vector_v.equals(vector_w)) {
            System.out.println("They are equals.");
        } else {
            System.out.println("They are not equals.");
        }

        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print(ArrayVector.generateArrayVector(scanner.nextInt()));
    }

}
