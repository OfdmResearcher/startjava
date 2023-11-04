public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        int age = 25;
        double height = 1.8;
        char firstLetterName = "Michael".charAt(0);

        if (!isMale) {
            System.out.println("Your application cannot be chosen, because of some restrictions for women");
        } else {
            System.out.println("Your application was chosen. You will be notified about next steps");
        }

        if (age > 18) {
            System.out.println("Alcohol is allowed to be sold to you");
        } else {
            System.out.println("Unfortunately, alcohol section is closed for you");
        }

        if (height < 1.8) {
            System.out.println("Unfortunately, you cannot join our basketball section");
        } else {
            System.out.println("Your application was chosen. You will be notified about next steps");
        }

        if (firstLetterName == 'M') {
            System.out.println("Your lottery ticket will be the participant for our next TV session");
        } else if (firstLetterName == 'I') {
            System.out.println("Your lottery ticket will be the participant for our grand prize session");
        } else {
            System.out.println("Unfortunately, you will be having a chance next time");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 25;
        int b = 4;
        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a == b) {
            System.out.println(a + " равно " + b);
        } else {
            System.out.println(a + " меньше " + b);
        }

        System.out.println("\n3. Проверка числа");
        int c = -4;
        if (c < 0) {
            if (c % 2 == 0) {
                System.out.println(c + " является отрицательным и четным");
            } else {
                System.out.println(c + " является отрицательным и нечетным");
            }
        } else if (c > 0) {
            if (c % 2 != 0) {
                System.out.println(c + " является положительным и нечетным");
            } else {
                System.out.println(c + " является положительным и четным");
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 293;
        int num2 = 223;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;

        if ((hundreds1 == hundreds2) && (tens1 == tens2) && (ones1 == ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + hundreds1 +
                    " (третий разряд), " + tens1 +
                    " (второй разряд), " + ones1 +
                    " (первый разряд)");
        } else if ((hundreds1 == hundreds2) && (tens1 != tens2) && (ones1 != ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + hundreds1 +
                    " (третий разряд) ");
        } else if ((hundreds1 != hundreds2) && (tens1 == tens2) && (ones1 != ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + tens1 +
                    " (второй разряд) ");
        } else if ((hundreds1 != hundreds2) && (tens1 != tens2) && (ones1 == ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + ones1 +
                    " (первый разряд)");
        } else if ((hundreds1 == hundreds2) && (tens1 == tens2) && (ones1 != ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + hundreds1 +
                    " (третий разряд), " + tens1 +
                    " (второй разряд)");
        } else if ((hundreds1 == hundreds2) && (tens1 != tens2) && (ones1 == ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + hundreds1 +
                    " (третий разряд), " + ones1 +
                    " (первый разряд)");
        } else if ((hundreds1 != hundreds2) && (tens1 == tens2) && (ones1 == ones2)) {
            System.out.println("Числа: " + num1 + " и " + num2 +
                    "\nодинаковые цифры: " + tens1 +
                    " (второй разряд), " + ones1 +
                    " (первый разряд)");
        } else if ((hundreds1 != hundreds2) && (tens1 != tens2) && (ones1 != ones2)) {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if ((symbol >= 0 && symbol <= 47) || (symbol >= 58 && symbol <= 64) || (symbol >= 91 && symbol <= 96) ||
                (symbol >= 123 && symbol <= 127)) {
            System.out.println(symbol + " не буква и не цифра");
        } else if (symbol >= 48 && symbol <= 57) {
            System.out.println(symbol + " цифра");
        } else if (symbol >= 65 && symbol <= 90) {
            System.out.println(symbol + " большая буква");
        } else if (symbol >= 97 && symbol <= 122) {
            System.out.println(symbol + " маленькая буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 301_000;
        if (deposit < 100_000) {
            System.out.println("Сумма вклада: " + deposit + "\nСумма начисленного процента: " +
                    (deposit * 0.05) + "\nИтоговая сумма: " + (deposit + (deposit * 0.05)));
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            System.out.println("Сумма вклада: " + deposit + "\nСумма начисленного процента: " +
                    (deposit * 0.07) + "\nИтоговая сумма: " + (deposit + (deposit * 0.07)));
        } else {
            System.out.println("Сумма вклада: " + deposit + "\nСумма начисленного процента: " +
                    (deposit * 0.1) + "\nИтоговая сумма: " + (deposit + (deposit * 0.1)));
        }

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int programmingPercentage = 92;
        int historyGrade = 0;
        int programmingGrade = 0;
        if (historyPercentage <= 60) {
            historyGrade = 2;
            System.out.println("История - " + historyGrade);
        } else if (historyPercentage > 60 && historyPercentage <= 73) {
            historyGrade = 3;
            System.out.println("История - " + historyGrade);
        } else if (historyPercentage > 73 && historyPercentage <= 91) {
            historyGrade = 4;
            System.out.println("История - " + historyGrade);
        } else if (historyPercentage > 91) {
            historyGrade = 5;
            System.out.println("История - " + historyGrade);
        }

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
            System.out.println("Программирование - " + programmingGrade);
        } else if (programmingPercentage > 60 && programmingPercentage <= 73) {
            programmingGrade = 3;
            System.out.println("Программирование - " + programmingGrade);
        } else if (programmingPercentage > 73 && programmingPercentage <= 91) {
            programmingGrade = 4;
            System.out.println("Программирование - " + programmingGrade);
        } else if (programmingPercentage > 91) {
            programmingGrade = 5;
            System.out.println("Программирование - " + programmingGrade);
        }
        double averageGrade = (historyGrade + programmingGrade) / (double) 2;
        double averagePercentage = (historyPercentage + programmingPercentage) / (double) 2;

        System.out.println("Средний балл оценок по предметам - " + averageGrade);
        System.out.println("Средний % по предметам - " + averagePercentage);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyPrice = 13000;
        int monthlyRent = 5000;
        int monthlyProductionCost = 9000;
        int annualRevenue = (monthlyPrice * 12) - ((monthlyRent + monthlyProductionCost) * 12);
        if (annualRevenue < 0) {
            System.out.println("Прибыль за год: " + annualRevenue);
        } else if (annualRevenue > 0) {
            System.out.println("Прибыль за год: +" + annualRevenue);
        } else {
            System.out.println("Прибыль за год: " + annualRevenue);
        }
    }
}