import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (char i = 33; i < 123; i++) {
            if ((i < 48 && i % 2 != 0) || (i > 96 && i < 123 && i % 2 == 0)) {
                System.out.printf("%4d          %c            %-10s\n", 
                        (int) i, i, Character.getName(i));
            }
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("_");
            }
            System.out.print(" ");
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int l = 0; l < i * 2 + 1; l++) {
                System.out.print("^");
            }
            System.out.println(" ");
        }

        System.out.println("\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.println("  |   2  3  4  5  6  7  8  9");
        System.out.println("__+_________________________");
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
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");
        int originalNumber = 2234321;
        int tempNumber = originalNumber;
        int reversedNumber = 0;
        int twosCount = 0;
        while (tempNumber > 0) {
            int reversedDigit = tempNumber % 10;
            reversedNumber = (reversedNumber * 10) + reversedDigit;
            tempNumber /= 10;
            if (reversedDigit == 2) {
                twosCount++;
            } 
        }
        String twosCountParity = twosCount % 2 == 0 ? 
                twosCount == 0 ? "нулевым" : "четным" : "нечетным";
        String palindromeCheck = originalNumber == reversedNumber ? "палиндром" : "не палиндром";
        System.out.println(reversedNumber + " - " + palindromeCheck + " c " +
                twosCountParity + " (" + twosCount + ") количеством двоек");

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА");
        int originalNumber2 = 101002;
        int tempNumber2 = originalNumber2;
        int threeDigitsCount = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (tempNumber2 > 0) {
            if (threeDigitsCount < 3) {
                sumRight = sumRight + (tempNumber2 % 10);
                threeDigitsCount++;
            } else {
                sumLeft = sumLeft + (tempNumber2 % 10);
            }
            tempNumber2 /= 10;
        }
        String firstThreeDigits = String.valueOf(originalNumber2).substring(0, 3);
        String lastThreeDigits = String.valueOf(originalNumber2).substring(3, 6);
        String luckyStatus = sumLeft == sumRight ? "счастливое число" : "несчастливое число";
        System.out.println("""
                %d - %s
                Сумма цифр %s = %d
                Сумма цифр %s = %d
                """.formatted(originalNumber2, luckyStatus, lastThreeDigits, 
                        sumRight, firstThreeDigits, sumLeft));

        System.out.println("8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ");
        Random random = new Random();
        String password = "";
        for (int i = 0; i < 8; i++) {
            int randomSymbol = random.nextInt(0, 5);
            if (randomSymbol == 0) {
                password += (char) random.nextInt(33, 48);
            } else if (randomSymbol == 1) {
                password += (char) random.nextInt(48, 58);
            } else if (randomSymbol == 2) {
                password += (char) random.nextInt(58, 65);
            } else if (randomSymbol == 3) {
                password += (char) random.nextInt(65, 91);
            } else {
                password += (char) random.nextInt(97, 123);
            }
        }
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                hasLower = true;
            } else if (Character.isUpperCase(password.charAt(i))) {
                hasUpper = true;
            } else if (Character.isDigit(password.charAt(i))) {
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