public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int counter = startSegment;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        do {
            if (counter % 2 == 0) {
                evenNumbersSum += counter;
            } else {
                oddNumbersSum += counter;
            }
            counter++;
        } while (counter <= endSegment);
        System.out.println("В отрезке [" + startSegment + ", " + endSegment +
                "] сумма четных чисел = " + evenNumbersSum + ", а нечетных = " + oddNumbersSum);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = c;
        if (c > max) {
            max = c;
            min = a;
        }
        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
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
            sum += digit;
            number /= 10;
        }
        System.out.println("\nСумма выделенных цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                if (counter == 5) {
                    System.out.println();
                    counter = 0;
                }
                System.out.printf("%4d", i);
                counter++;
            }
        }

        if (counter != 5) {
            for (int i = 0; i < 5 - counter; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int number2 = 3242592;
        int currNumber = number2;
        counter = 0;
        while (currNumber > 0) {
            if (currNumber % 10 == 2) {
                counter++;
            }
            currNumber /= 10;
        }
        String parityCheckResult = counter % 2 == 0 ? "четное" : "нечетное";
        System.out.println("В " + number2 + " " + parityCheckResult + " (" + counter + ") количество двоек");

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

        rowCounter = 1;
        do {
            int symbolCounter = 1;
            do {
                System.out.print("$");
                symbolCounter++;
            } while (symbolCounter <= rowCounter && symbolCounter <= 6 - rowCounter);
            rowCounter++;
            System.out.println();
        } while (rowCounter < 6);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL      CHARACTER      DESCRIPTION");
        for (int i = 33; i < 123; i++) {
            if ((i % 2 != 0 && i <= 47) || (i % 2 == 0 && i >= 97 && i <= 122)) {
                System.out.printf("%4s%14c               %-10s\n", i, i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int number3 = 1234321;
        int reversedNumber = 0;
        currNumber = number3;
        while (currNumber > 0) {
            reversedNumber = (reversedNumber * 10) + (currNumber % 10);
            currNumber /= 10;
        }
        if (reversedNumber == number3) {
            System.out.println("Число " + number3 + " - палиндром");
        } else {
            System.out.println("Число " + number3 + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int number4 = 524452;
        currNumber = number4;
        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;
        for (int i = 0; i < 6; i++) {
            int digit = currNumber % 10;
            if (i < 3) {
                lastThreeDigitsSum += digit;
            } else {
                firstThreeDigitsSum += digit;
            }
            currNumber /= 10;
        }
        if (lastThreeDigitsSum == firstThreeDigitsSum) {
            System.out.println("Число " + number4 + " - счастливое\n" +
                    "Сумма цифр " + (number4 / 1000) + " = " + firstThreeDigitsSum + "\n" +
                    "Сумма цифр " + (number4 % 1000) + " = " + lastThreeDigitsSum);
        } else {
            System.out.println("Число " + number4 + " - не счастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("  |    2   3   4   5   6   7   8   9");
        System.out.println("------------------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}