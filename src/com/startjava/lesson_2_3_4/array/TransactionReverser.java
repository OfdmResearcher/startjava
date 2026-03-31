package com.startjava.lesson_2_3_4.array;

public class TransactionReverser {
    public static void main(String[] args) {
        printResult(new int[]{});
        printResult(null);
        printResult(new int[]{5});
        printResult(new int[]{6, 8, 9, 1});
        printResult(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    public static void printResult(int[] transactions) {
        if (transactions == null) {
            System.out.println("Ошибка в данных");
        } else if (transactions.length == 0) {
            System.out.println("Нет данных");
        } else {
            System.out.println("Исходные транзакции: [" + formatArray(transactions) + "]");
            int[] reversedTransactions = reverseTransactions(transactions);
            System.out.println(" В обратном порядке: [" + formatArray(reversedTransactions) + "]");
        }
    }

    public static String formatArray(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i != array.length - 1) {
                result += ", ";
            }
        }
        return result;
    }

    public static int[] reverseTransactions(int[] transactions) {
        int[] reversedTransactions = new int[transactions.length];
        for (int i = 0; i < reversedTransactions.length; i++) {
            reversedTransactions[i] = transactions[transactions.length - 1 - i];
        }
        return reversedTransactions;
    }
}
