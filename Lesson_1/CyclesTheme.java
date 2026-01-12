import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (char i = 33; i < 123; i++) {
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                System.out.printf("  %-11d %-12c %-30s%n",
                        (int) i, i, Character.getName(i));
            }
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int i = 0; i < 5; i++) {
            System.out.print("---------- ");
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("^");
            }
            System.out.println(" ");
        }

        System.out.println("\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.print("""
                  |   2  3  4  5  6  7  8  9
                --+-------------------------
                """);
        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j <= 9; j++) {
                System.out.printf(" %2d", i * j);
            }
            System.out.println(" ");
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%2d ", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println(" ");
                counter = 0;
            }
        }
        if (counter != 0) {
            for (int i = 0; i < 5 - counter; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        System.out.println("\n\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        if (max < b) {
            max = b; 
        }
        if (max < c) {
            max = c;
        }
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int originalNumber = 2234321;
        int currNumber = originalNumber;
        int reversedNumber = 0;
        int twosCount = 0;
        while (currNumber > 0) {
            int remainder = currNumber % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            currNumber /= 10;
            if (remainder == 2) {
                twosCount++;
            } 
        }
        String twosCountParity = twosCount % 2 == 0 ? 
                twosCount == 0 ? "нулевым" : "четным" 
                : "нечетным";
        String palindromeCheck = originalNumber == reversedNumber ? "палиндром" : "не палиндром";
        System.out.println(reversedNumber + " - " + palindromeCheck + " c " +
                twosCountParity + " (" + twosCount + ") количеством двоек");

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        originalNumber = 101002;
        currNumber = originalNumber;
        int threeDigitsCount = 0;
        int leftSum = 0;
        int rightSum = 0;
        while (currNumber > 0) {
            if (threeDigitsCount < 3) {
                rightSum = rightSum + (currNumber % 10);
                threeDigitsCount++;
            } else {
                leftSum = leftSum + (currNumber % 10);
            }
            currNumber /= 10;
        }
        int leftHalf = originalNumber / 1000;
        int rightHalf = originalNumber % 1000;
        String luckyStatus = leftSum == rightSum ? "счастливое число" : "несчастливое число";
        System.out.println("""
                %d - %s
                Сумма цифр %03d = %d
                Сумма цифр %03d = %d
                """.formatted(originalNumber, luckyStatus, rightHalf, 
                        rightSum, leftHalf, leftSum));

        System.out.println("8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ");
        Random random = new Random();
        String password = "";
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < 8; i++) {
            char symbol = (char) random.nextInt(33, 123);
            password += symbol;
            if (Character.isLowerCase(symbol)) {
                hasLower = true;
            } else if (Character.isUpperCase(symbol)) {
                hasUpper = true;
            } else if (Character.isDigit(symbol)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        String passwordStrength = "Слабый";
        if (password.length() >= 8 && hasLower && hasUpper && hasSpecial) {
            passwordStrength = "Надежный";
        } else if (password.length() >= 8 && (hasUpper || hasDigit)) {
            passwordStrength = "Средний";
        }
        System.out.println("""
                Пароль: %s
                Надежность: %s
                """.formatted(password, passwordStrength));
    }
}