public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        if (!isMale) {
            System.out.println("Your application cannot be chosen, because of some restrictions for women");
        } else {
            System.out.println("Your application was chosen. You will be notified about next steps");
        }

        int age = 25;
        if (age > 18) {
            System.out.println("Alcohol is allowed to be sold to you");
        } else {
            System.out.println("Unfortunately, alcohol section is closed for you");
        }

        double height = 1.8;
        if (height < 1.8) {
            System.out.println("Unfortunately, you cannot join our basketball section");
        } else {
            System.out.println("Your application was chosen. You will be notified about next steps");
        }

        char firstLetterName = "Michael".charAt(0);
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
        int c = 7;
        System.out.print(c);
        if (c != 0) {
            if (c % 2 == 0) {
                System.out.print(" является четным и ");
            } else {
                System.out.print(" является нечетным и ");
            }
            if (c < 0) {
                System.out.println("отрицательным");
            } else {
                System.out.println("положительным");
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 245;
        int num2 = 745;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        System.out.println("Числа: " + num1 + " и " + num2 + "\nОдинаковые цифры: ");

        if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            if (hundreds1 == hundreds2) {
                System.out.println(hundreds1 + " (третий разряд)");
            }
            if (tens1 == tens2) {
                System.out.println(tens1 + " (второй разряд)");
            }
            if (ones1 == ones2) {
                System.out.println(ones1 + " (первый разряд)");
            }
        } else {
            System.out.println("равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " маленькая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " цифра");
        } else {
            System.out.println(symbol + " не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 301_000;
        double percent = 0.1;
        if (deposit < 100_000) {
            percent = 0.05;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 0.07;
        }
        System.out.println("Сумма вклада: " + deposit + "\nСумма начисленного процента: " +
                (deposit * percent) + "\nИтоговая сумма: " + (deposit + (deposit * percent)));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4
;        } else if (historyPercent > 91) {
            historyGrade = 5;
        }

        int programmingPercent = 92;
        int programmingGrade = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        double avgGrade = (historyGrade + programmingGrade) / 2d;
        double avgPercent = (historyPercent + programmingPercent) / 2d;

        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        System.out.println("Средний балл оценок по предметам - " + avgGrade);
        System.out.println("Средний % по предметам - " + avgPercent);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyPrice = 13000;
        int monthlyRent = 5000;
        int monthlyProductionCost = 9000;
        int annualRevenue = 12 * (monthlyPrice - (monthlyRent + monthlyProductionCost));
        if (annualRevenue <= 0) {
            System.out.println("Прибыль за год: " + annualRevenue);
        } else {
            System.out.println("Прибыль за год: +" + annualRevenue);
        }
    }
}