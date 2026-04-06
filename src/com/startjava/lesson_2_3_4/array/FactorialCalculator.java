package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        calculateFactorial();
        calculateFactorial((int[]) null);
        calculateFactorial(-5);
        calculateFactorial(7, 0, 21);
        calculateFactorial(1, 20, 5, -3);
    }

    private static void calculateFactorial(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка в данных");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Нет данных");
            return;
        }
        long[] factorials = getFactorials(numbers);
        printFactorials(numbers, factorials);
    }

    private static long[] getFactorials(int... numbers) {
        int length = numbers.length;
        long[] factorials = new long[length];
        for (int i = 0; i < length; i++) {
            int number = numbers[i];
            factorials[i] = 1;
            if (number >= 0 && number <= 20) {
                for (int j = 1; j <= number; j++) {
                    factorials[i] *= j;
                }
            }
        }
        return factorials;
    }

    private static void printFactorials(int[] numbers, long[] factorials) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int number = numbers[i];
            factorials[i] = 1;
            if (number < 0) {
                stringBuilder.append("Ошибка: факториал ").append(number).append("! не определен");
                System.out.println(stringBuilder);
            } else if (number == 0 || number == 1) {
                stringBuilder.append(number).append("! = 1");
                System.out.println(stringBuilder);
            } else if (number > 20) {
                stringBuilder.append("Ошибка: факториал ").append(number)
                        .append("! слишком велик (максимум 20!)");
                System.out.println(stringBuilder);
            } else {
                stringBuilder.append(number).append("! = ");
                for (int j = 1; j <= number; j++) {
                    factorials[i] *= j;
                    stringBuilder.append(j);
                    stringBuilder.append(j < number ? " * " : " = ");
                }
                stringBuilder.append(factorials[i]);
                System.out.println(stringBuilder);
            }
        }
    }
}
