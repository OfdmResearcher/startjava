public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int firstPoint = -10;
        int secondPoint = 21;
        int counter = firstPoint;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        do {
            if (counter % 2 == 0) {
                evenNumbersSum += counter;
            } else {
                oddNumbersSum += counter;
            }
            counter++;
        } while (counter <= secondPoint);
        System.out.println("В отрезке [" + firstPoint + ", " + secondPoint + "] сумма четных чисел = " +
                evenNumbersSum + ", а нечетных = " + oddNumbersSum);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int max = firstNumber;
        int min = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }
        if (secondNumber < min) {
            min = secondNumber;
        }
        if (thirdNumber < min) {
            min = thirdNumber;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int digit = 0;
        int sum = 0;
        while (number != 0) {
            digit = number % 10;
            System.out.print(digit + " ");
            sum += digit;
            number /= 10;
        }
        System.out.println("\nСумма выделенных цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int counter2 = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                if (counter2 != 5) {
                    System.out.printf("%4d", i);
                    counter2++;
                } else {
                    System.out.println();
                    System.out.printf("%4d", i);
                    counter2 = 1;
                }
            }
        }
        if (counter2 != 5) {
            for (int i = 0; i < 5 - counter2; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int number2 = 3242592;
        int tempNumber2 = number2;
        int digit2 = 0;
        int counter3 = 0;
        while (tempNumber2 != 0) {
            digit2 = tempNumber2 % 10;
            if (digit2 == 2) {
                counter3++;
            }
            tempNumber2 /= 10;
        }
        if (counter3 % 2 == 0) {
            System.out.println("В " + number2 + " четное (" + counter3 + ") количество двоек");
        } else {
            System.out.println("В " + number2 + " нечетное (" + counter3 + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }

        int rowCounter = 0;
        while (rowCounter < 5) {
            int symbolCounter = 5 - rowCounter;
            while (symbolCounter > 0) {
                System.out.print("#");
                symbolCounter--;
            }
            System.out.println();
            rowCounter++;
        }

        int rowCounter2 = 1;
        do {
            int symbolCounter2 = 1;
            do {
                System.out.print("$");
                symbolCounter2++;
            } while (symbolCounter2 <= rowCounter2 && symbolCounter2 <= 6 - rowCounter2);
            rowCounter2++;
            System.out.println();
        } while (rowCounter2 < 6);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL      CHARACTER      DESCRIPTION");
        for (int i = 33; i < Character.MAX_VALUE; i++) {
            if ((i % 2 != 0 && i <= 47) || (i % 2 == 0 && i >= 97 && i <= 122)) {
                System.out.printf("%4s%14c               %-10s\n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number3 = 1234321;
        int reversedNumber = 0;
        int tempNumber3 = number3;
        while (tempNumber3 != 0) {
            int digit3 = tempNumber3 % 10;
            reversedNumber = reversedNumber * 10 + digit3;
            tempNumber3 /= 10;
        }
        if (reversedNumber == number3) {
            System.out.println("Число " + number3 + " - палиндром");
        } else {
            System.out.println("Число " + number3 + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int number4 = 524452;
        int tempNumber4 = number4;
        int counter4 = 0;
        int sumFirstThreeDigits = 0;
        int sumLastThreeDigits = 0;
        for (int i = 0; i < 7; i++) {
            int digit4 = tempNumber4 % 10;
            counter4++;
            if (counter4 < 4) {
                sumLastThreeDigits += digit4;
            } else {
                sumFirstThreeDigits += digit4;
            }
            tempNumber4 /= 10;
        }
        if (sumLastThreeDigits == sumFirstThreeDigits) {
            System.out.println("Число " + number4 + " - счастливое\n" +
                    "Сумма цифр " + (number4 / 100000) +
                    (number4 % 100000 / 10000) +
                    (number4 % 10000 / 1000) + " = " + sumFirstThreeDigits + "\n" +
                    "Сумма цифр " + (number4 % 1000 / 100) +
                    (number4 % 100 / 10) +
                    (number4 % 10) + " = " + sumLastThreeDigits);
        } else {
            System.out.println("Число " + number4 + " - не счастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("  | 2 3 4  5  6  7  8  9");
        System.out.println("---------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}