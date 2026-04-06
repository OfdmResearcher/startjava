package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class TransactionReverser {
    public static void main(String[] args) {
        handleTransactions(new int[]{});
        handleTransactions(null);
        handleTransactions(new int[]{5});
        handleTransactions(new int[]{6, 8, 9, 1});
        handleTransactions(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void handleTransactions(int[] transactions) {
        if (transactions == null) {
            System.out.println("Ошибка в данных");
            return;
        }
        if (transactions.length == 0) {
            System.out.println("Нет данных");
            return;
        }
        int[] reversedTransactions = reverse(transactions);
        printTransactions(transactions, reversedTransactions);
    }

    private static int[] reverse(int[] transactions) {
        int length = transactions.length;
        int[] reversedTransactions = new int[length];
        for (int number : transactions) {
            reversedTransactions[--length] = number;
        }
        return reversedTransactions;
    }

    private static void printTransactions(int[] transactions, int[] reversedTransactions) {
        System.out.println("Исходные транзакции: " + Arrays.toString(transactions));
        System.out.println(" В обратном порядке: " + Arrays.toString(reversedTransactions));
    }
}
