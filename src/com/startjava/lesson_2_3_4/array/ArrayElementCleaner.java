package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayElementCleaner {
    public static void main(String[] args) {
        int arraySize = 15;
        printArrayResult(createRandomArray(arraySize), -1);
        printArrayResult(createRandomArray(arraySize), 15);
        printArrayResult(createRandomArray(arraySize), 0);
        printArrayResult(createRandomArray(arraySize), 14);
    }

    private static double[] createRandomArray(int numberOfElements) {
        double[] array = new double[numberOfElements];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    private static void clearElementsGreaterThanIndex(double[] values, int index) {
        for (int i = 0; i < values.length; i++) {
            if (values[index] < values[i]) {
                values[i] = 0;
            }
        }
    }

    private static void printArrayResult(double[] values, int index) {
        if (isInvalidIndex(index, values.length)) {
            return;
        }
        double[] newArray = values.clone();
        clearElementsGreaterThanIndex(newArray, index);
        printTwoLinesArray(values, "Исходный массив:");
        System.out.println();
        printTwoLinesArray(newArray, "Измененный массив:");
        System.out.println();
        System.out.printf("Значение по индексу %d: %.3f%n", index, values[index]);
    }

    private static boolean isInvalidIndex(int index, int length) {
        if (index < 0 || index >= length) {
            System.out.println(index + " ошибочный индекс, должен быть в диапазоне 0 - " + (length - 1));
            return true;
        }
        return false;
    }

    private static void printTwoLinesArray(double[] values, String arrayName) {
        System.out.println(arrayName);
        int midValue = values.length / 2 + values.length % 2;
        for (int i = 0; i < midValue; i++) {
            System.out.printf("%.3f ", values[i]);
        }
        System.out.println();
        for (int i = midValue; i < values.length; i++) {
            System.out.printf("%.3f ", values[i]);
        }
    }
}
