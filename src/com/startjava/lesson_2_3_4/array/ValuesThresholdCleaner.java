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
        if (isInvalidIndex(index, length)) {
            return;
        }
        float[] values = createRandomValues(length);
        float[] resultValues = clearValuesGreaterThanIndex(values, index);

        printResult(values, resultValues, index);
    }

    private static boolean isInvalidIndex(int index, int length) {
        if (index < 0 || index >= length) {
            System.out.printf("%d ошибочный индекс, должен быть в диапазоне 0 - %d%n", index, length - 1);
            return true;
        }
        return false;
    }

    private static float[] createRandomValues(int length) {
        float[] values = new float[length];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextFloat();
        }
        return values;
    }

    private static float[] clearValuesGreaterThanIndex(float[] values, int index) {
        float[] resultValues = values.clone();
        for (int i = 0; i < resultValues.length; i++) {
            if (resultValues[index] < resultValues[i]) {
                resultValues[i] = 0;
            }
        }
        return resultValues;
    }

    private static void printResult(float[] original, float[] result, int index) {
        printTwoLines(original, "Исходный массив:");
        printTwoLines(result, "Измененный массив:");
        System.out.printf("Значение по индексу %d: %.3f%n", index, original[index]);
    }

    private static void printTwoLines(float[] values, String msg) {
        System.out.println(msg);
        int midValue = values.length / 2 + values.length % 2;
        for (int i = 0; i < values.length; i++) {
            if (i == midValue) {
                System.out.println();
            }
            System.out.printf("%.3f ", values[i]);
        }
        System.out.println();
    }
}
