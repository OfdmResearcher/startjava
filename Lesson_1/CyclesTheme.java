public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int firstValue = -10;
        int tempFirstValue = firstValue;
        int secondValue = 21;
        int tempSecondValue = secondValue;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (tempFirstValue % 2 == 0) {
                sumEvenNumbers += tempFirstValue;
            } else {
                sumOddNumbers += tempFirstValue;
            }
            tempFirstValue++;
        } while (tempFirstValue - 1 < tempSecondValue);
        System.out.println("В отрезке [" + firstValue + ", " + secondValue + "] сумма четных чисел = " + sumEvenNumbers + ", а нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = -1;
        int b = 5;
        int c = 10;
        int min = 0;
        int max = 0;
        if (a < b && a < c) {
            min = a;
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        } else if (a > b && b < c) {
            min = b;
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            min = c;
            if (b > a) {
                max = b;
            } else {
                max = a;
            }
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number = number / 10;
            sum += digit;
        }
        System.out.println("\nsum = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                if (counter < 5) {
                    System.out.printf("%4d", i);
                    counter++;
                } else {
                    System.out.println();
                    System.out.printf("%4d", i);
                    counter = 1;
                }
            }
        }
        if (counter != 5) {
            for (int i = 0; i < 5 - counter; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int value = 3242592;
        int counterTwos = 0;
        while (value > 0) {
            int digit = value % 10;
            if (digit == 2) {
                counterTwos++;
            }
            value = value / 10;
        }
        if (counterTwos % 2 == 0) {
            System.out.println("В 3242592 четное количество двоек — " + counterTwos);
        } else {
            System.out.println("В 3242592 нечетное количество двоек — " + counterTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int s = 0;
        while (s < 5) {
            int i = 5;
            while (i > s) {
                System.out.print("#");
                i--;
            }
            System.out.println();
            s++;
        }

        System.out.println();
        int k = 1;
        do {
            int l = 1;
            do {
                System.out.print("$");
                l++;
            } while (l <= k && l <= 6 - k);
            System.out.println();
            k++;
        } while (k < 6);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL      CHARACTER      DESCRIPTION");
        for (int i = 15; i < Character.MAX_VALUE; i++) {
            if ((i % 2 != 0 && i <= 47) || (i % 2 == 0 && i >= 97 && i <= 122)) {
                System.out.printf("%4s", i);
                System.out.printf("%14s", (char) i);
                System.out.printf("                %-10s\n", Character.getName((char) i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number3 = 1234321;
        int tempNumber = number3;
        int reversedNumber = 0;
        while (tempNumber != 0) {
            int remainder = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempNumber = tempNumber / 10;
        }
        if (number3 == reversedNumber) {
            System.out.println("Число " + number3 + " является палиндромом");
        } else {
            System.out.println("Число " + number3 + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int number2 = 123456;
        int tempNumber2 = 123456;
        int counter2 = 0;
        int sumLastDigits = 0;
        while (counter2 < 3) {
            int rem2 = tempNumber2 % 10;
            sumLastDigits += rem2;
            tempNumber2 = tempNumber2 / 10;
            counter2++;
        }
        int firstDigit = number2 / 100000;
        int secondDigit = (number2 / 10000) % 10;
        int thirdDigit = (number2 / 1000) % 10;
        int sumFirstDigits = firstDigit + secondDigit + thirdDigit;

        if (sumLastDigits == sumFirstDigits) {
            System.out.println("Число " + number2 + " является счастливым\n" +
                    "Сумма цифр ABC = S1, а сумма DEF = S2");
        } else {
            System.out.println("Число " + number2 + " не является счастливым\n" +
                    "Сумма цифр ABC = " + sumFirstDigits + ", а сумма DEF = " + sumLastDigits);
        }

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("  ");
                    } else if (j == 1) {
                        System.out.print("| ");
                    } else {
                        System.out.print(j + "  ");
                        if (j == 9) {
                            System.out.println();
                        }
                    }
                }
                if (i == 1) {
                    if (j != 9) {
                        System.out.print("---");
                    } else {
                        System.out.println();
                    }
                }
                if (j == 0 && i != 0 && i != 1) {
                    System.out.print(i + " ");
                } else if (j == 1 && i != 0 && i != 1) {
                    System.out.print("| ");
                } else {
                    if (i != 0 && i != 1) {
                        if (j * i / 10 == 0) {
                            System.out.print((j * i) + "  ");
                        } else {
                            System.out.print((j * i) + " ");
                            if (j == 9) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }
}
