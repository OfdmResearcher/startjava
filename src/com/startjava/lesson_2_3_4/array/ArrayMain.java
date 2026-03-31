package com.startjava.lesson_2_3_4.array;

import java.lang.reflect.Method;

public class ArrayMain {
    public static void main(String[] args) {
        int[] array = {};
        System.out.println("Тип массива - " + array.getClass());
        System.out.println("Суперкласс типа массива - " + array.getClass().getSuperclass());

        System.out.println("Доступные методы:");
        for (Method m : array.getClass().getMethods()) {
            System.out.println(m.getName());
        }
//        int[] numbers = new int[6];
//        float[] numbers1 = {5.1f, .5f, 200.3f};
//
//        System.out.println(numbers.length);
//        System.out.println(numbers1.length);
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
//        System.out.println(" ");
//        String[] text = new String[3];
//        for (String word:text) {
//            System.out.println(word);
//        }
    }
}
