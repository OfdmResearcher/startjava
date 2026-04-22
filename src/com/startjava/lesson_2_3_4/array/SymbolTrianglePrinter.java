package com.startjava.lesson_2_3_4.array;

public class SymbolTrianglePrinter {
    public static void main(String[] args) {
        processTriangle('0', '9', true);
        processTriangle('/', '!', false);
        processTriangle('A', 'J', false);
    }

    private static void processTriangle(char start, char end, boolean direction) {
        if (isInvalidRange(start, end)) {
            return;
        }
        String triangle = buildTriangle(start, end, direction);
        printTriangle(triangle);
    }

    private static boolean isInvalidRange(char start, char end) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n%n",
                    (int) start, (int) end);
            return true;
        }
        return false;
    }

    private static String buildTriangle(char start, char end, boolean direction) {
        StringBuilder result = new StringBuilder();
        int height = end - start + 1;
        char startSymbol = direction ? start : end;
        for (int i = 1; i <= height; i++) {
            result.append(" ".repeat(height - i));
            char current = direction ? startSymbol++ : startSymbol--;
            result.append(String.valueOf(current).repeat((i * 2) - 1));
            result.append("\n");
        }
        return String.valueOf(result);
    }

    private static void printTriangle(String triangle) {
        System.out.println(triangle);
    }
}
