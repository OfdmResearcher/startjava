public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int counter = start;
        int end = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= end);
        System.out.println("В отрезке [" + start + ", " + end + "] сумма четных чисел = "
                + sumEvenNumbers + ", а нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = -1;
        int b = 5;
        int c = 10;
        int min = a;
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int workNumber = 1234;
        int sum = 0;
        while (workNumber > 0) {
            int digit = workNumber % 10;
            System.out.print(digit);
            workNumber /= 10;
            sum += digit;
        }
        System.out.println("\nsum = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            if (counter < 5) {
                System.out.printf("%4d", i);
                counter++;
                if (counter == 5) {
                    System.out.println();
                    counter = 0;
                }
            }
        }
        if (counter != 5) {
            for (int i = 0; i < 5 - counter; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        workNumber = 3242592;
        int tempWorkNumber = workNumber;
        int counterTwos = 0;
        while (tempWorkNumber > 0) {
            if (tempWorkNumber % 10 == 2) {
                counterTwos++;
            }
            tempWorkNumber /= 10;
        }
        if (counterTwos % 2 == 0) {
            System.out.println("В " + workNumber + " четное количество двоек — " + counterTwos);
        } else {
            System.out.println("В " + workNumber + " нечетное количество двоек — " + counterTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int numberGrids = 0;
        while (numberGrids < 5) {
            int i = 5;
            while (i > numberGrids) {
                System.out.print("#");
                i--;
            }
            System.out.println();
            numberGrids++;
        }

        System.out.println();
        int line = 1;
        do {
            int numberDollars = 1;
            do {
                System.out.print("$");
                numberDollars++;
            } while (numberDollars <= line && numberDollars <= 6 - line);
            System.out.println();
            line++;
        } while (line < 6);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL      CHARACTER      DESCRIPTION");
        for (int i = 15; i < Character.MAX_VALUE; i++) {
            if ((i % 2 != 0 && i <= 47) || (i % 2 == 0 && i >= 97 && i <= 122)) {
                System.out.printf("%4s%14c                %-10s\n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        workNumber = 1234321;
        tempWorkNumber = workNumber;
        int reversedNumber = 0;
        while (tempWorkNumber > 0) {
            int digit = tempWorkNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempWorkNumber /= 10;
        }
        if (workNumber == reversedNumber) {
            System.out.println("Число " + workNumber + " является палиндромом");
        } else {
            System.out.println("Число " + workNumber + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        workNumber = 123456;
        tempWorkNumber = 123456;
        counter = 0;
        int sumLastDigits = 0;
        int sumFirstDigits = 0;
        while (counter < 6) {
            int digit = tempWorkNumber % 10;
            if (counter < 3) {
                sumLastDigits += digit;
            } else {
                sumFirstDigits += digit;
            }
            tempWorkNumber /= 10;
            counter++;
        }

        if (sumLastDigits == sumFirstDigits) {
            System.out.println("Число " + workNumber + " является счастливым\n" +
                    "Сумма цифр ABC = " + sumFirstDigits + ", а сумма DEF = " + sumLastDigits);
        } else {
            System.out.println("Число " + workNumber + " не является счастливым\n" +
                    "Сумма цифр ABC = " + sumFirstDigits + ", а сумма DEF = " + sumLastDigits);
        }

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("  | 2 3 4  5  6  7  8  9");
        System.out.println("---------------------------");
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                } else if (j == 1) {
                    System.out.print("| ");
                } else if (j > 1 && j < 9) {
                    System.out.print((j * i) + " ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}

