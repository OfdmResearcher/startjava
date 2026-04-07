package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        processFactorials();
        processFactorials((int[]) null);
        processFactorials(-5);
        processFactorials(7, 0, 21);
        processFactorials(1, 20, 5, -3);
    }

    private static void processFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка в данных");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Нет данных");
            return;
        }
        long[] factorials = calculateFactorials(numbers);
        printFactorialExpressions(numbers, factorials);
    }

    private static long[] calculateFactorials(int... numbers) {
        int length = numbers.length;
        long[] factorials = new long[length];
        for (int i = 0; i < length; i++) {
            int number = numbers[i];
            if (number >= 0 && number <= 20) {
                factorials[i] = 1;
                for (int j = 1; j <= number; j++) {
                    factorials[i] *= j;
                }
            }
        }
        return factorials;
    }

    private static void printFactorialExpressions(int[] numbers, long[] factorials) {
        int length = numbers.length;
        StringBuilder expression = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = numbers[i];
            if (number < 0) {
                expression.append("Ошибка: факториал ").append(number).append("! не определен");
                System.out.println(expression);
            } else if (number == 0 || number == 1) {
                expression.append(number).append("! = 1");
                System.out.println(expression);
            } else if (number > 20) {
                expression.append("Ошибка: факториал ").append(number)
                        .append("! слишком велик (максимум 20!)");
                System.out.println(expression);
            } else {
                expression.append(number).append("! = ");
                for (int j = 1; j <= number; j++) {
                    expression.append(j);
                    expression.append(j < number ? " * " : " = ");
                }
                expression.append(factorials[i]);
                System.out.println(expression);
            }
            expression.setLength(0);
        }
    }
}
