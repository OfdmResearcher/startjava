package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ValuesThresholdCleaner {
    public static void main(String[] args) {
        int length = 15;
        handleValuesByIndex(length, -1);
        handleValuesByIndex(length, 15);
        handleValuesByIndex(length, 0);
        handleValuesByIndex(length, 14);
    }

    private static void handleValuesByIndex(int length, int index) {
        double[] values = createRandomValues(length);

        if (isInvalidIndex(index, values.length)) {
            return;
        }
        double[] cleanedValues = clearElementsGreaterThanIndex(values, index);

        printResult(values, cleanedValues, index);
    }

    private static double[] createRandomValues(int length) {
        double[] values = new double[length];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextFloat();
        }
        return values;
    }

    private static boolean isInvalidIndex(int index, int length) {
        if (index < 0 || index >= length) {
            System.out.println(index + " ошибочный индекс, должен быть в диапазоне 0 - " + (length - 1));
            return true;
        }
        return false;
    }

    private static double[] clearElementsGreaterThanIndex(double[] values, int index) {
        double[] cleanedValues = values.clone();
        for (int i = 0; i < cleanedValues.length; i++) {
            if (cleanedValues[index] < cleanedValues[i]) {
                cleanedValues[i] = 0;
            }
        }
        return cleanedValues;
    }

    private static void printResult(double[] original, double[] cleaned, int index) {
        printTwoLines(original, "Исходный массив:");
        System.out.println();
        printTwoLines(cleaned, "Измененный массив:");
        System.out.println();
        System.out.printf("Значение по индексу %d: %.3f%n", index, original[index]);
    }

    private static void printTwoLines(double[] values, String arrayName) {
        System.out.println(arrayName);
        int midValue = values.length / 2 + values.length % 2;
        for (int i = 0; i < values.length; i++) {
            if (i == midValue) {
                System.out.println();
            }
            System.out.printf("%.3f ", values[i]);
        }
    }
}
