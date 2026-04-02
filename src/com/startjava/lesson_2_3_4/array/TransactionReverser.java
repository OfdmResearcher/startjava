package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class TransactionReverser {
    public static void main(String[] args) {
        process(new int[]{});
        process(null);
        process(new int[]{5});
        process(new int[]{6, 8, 9, 1});
        process(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    public static void process(int[] transactions) {
        if (transactions == null) {
            System.out.println("Ошибка в данных");
            return;
        }
        if (transactions.length == 0) {
            System.out.println("Нет данных");
            return;
        }
        int[] reversedTransactions = reverseTransactions(transactions);
        printResult(transactions, reversedTransactions);
    }

    public static int[] reverseTransactions(int[] transactions) {
        int length = transactions.length;
        int[] reversedTransactions = new int[length];
        for (int number : transactions) {
            reversedTransactions[--length] = number;
        }
        return reversedTransactions;
    }

    public static void printResult(int[] transactions, int[] reversedTransactions) {
        System.out.println("Исходные транзакции: " + Arrays.toString(transactions));
        System.out.println(" В обратном порядке: " + Arrays.toString(reversedTransactions));
    }
}
