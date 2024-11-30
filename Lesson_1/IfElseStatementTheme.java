import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("The pension age is after 60");
        } else {
            System.out.println("The pension age is after 65");
        }

        int age = 30;
        if (age > 18) {
            System.out.println("Accepted, you can follow the next step to get the driving license");
        } else {
            System.out.println("Rejected, for more info, please, visit our website");
        }

        double height = 1.8;
        if (height < 1.8) {
            System.out.println("Your size is L or less");
        } else {
            System.out.println("Your size is XL or more");
        }

        char nameFirstLetter = "Isabel".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Congratulations. Your name was selected for the first prize: 500 dollars");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Congratulations. Your name was selected for the second prize: 50 dollars");
        } else {
            System.out.println("Unfortunately, your name was not selected for this time");
        }

        System.out.println("\n 2. Поиск большего числа");
        int firstValue = 25;
        int secondValue = 5;
        if (firstValue > secondValue) {
            System.out.println(firstValue + " (первое число) больше " + secondValue + " (второе число)");
        } else if (firstValue < secondValue) {
            System.out.println(secondValue + " (второе число) больше " + firstValue + " (первое число)");
        } else {
            System.out.println("Числа равны и их значение - " + firstValue);
        }

        System.out.println("\n 3. Проверка числа");
        int number = 15;
        if (number != 0) {
            if (number > 0) {
                System.out.print(number + " является положительным и ");
            } else {
                System.out.print(number + " является отрицательным и ");
            }
            if (number % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        } else {
            System.out.println("Число является нулем");
        }

        System.out.println("\n 4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        int hundreds1 = number1 / 100;
        int hundreds2 = number2 / 100;
        int tens1 = number1 % 100 / 10;
        int tens2 = number2 % 100 / 10;
        int ones1 = number1 % 10;
        int ones2 = number2 % 10;
        System.out.println("Числа: " + number1 + " и " + number2 + "\nОдинаковые цифры: ");
        if ((hundreds1 == hundreds2) || (tens1 == tens2) || (ones1 == ones2)) {
            if (hundreds1 == hundreds2) {
                System.out.println(hundreds1 + " - третий разряд");
            }
            if (tens1 == tens2) {
                System.out.println(tens1 + " - второй разряд");
            }
            if (ones1 == ones2) {
                System.out.println(ones1 + " - первый разряд");
            }
        } else {
            System.out.println("Равные цифры не были найдены");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - маленькая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - цифра");
        } else {
            System.out.println(symbol + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double deposit = 321123.59;
        double percentage = 0.1;
        if (deposit < 100000) {
            percentage = 0.05;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percentage = 0.07;
        }
        System.out.println(deposit + " - сумма вклада\n" +
                (deposit * percentage) + " - сумма начисленного %\n" +
                (deposit + deposit * percentage) + " - итоговая сумма с %");

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int historyGrade = 5;
        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage > 60 && historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage > 73 && historyPercentage <= 91) {
            historyGrade = 4;
        }
        System.out.println("История - " + historyGrade);

        int programmingPercenatge = 92;
        int programmingGrade = 5;
        if (programmingPercenatge <= 60) {
            programmingGrade = 2;
        } else if (programmingPercenatge > 60 && programmingPercenatge <= 73) {
            programmingGrade = 3;
        } else if (programmingPercenatge > 73 && programmingPercenatge <= 91) {
            programmingGrade = 4;
        }
        System.out.println("Программирование - " + programmingGrade);

        double avgScore = (historyGrade + programmingGrade) / 2;
        double avgPercentage = (historyPercentage + programmingPercenatge) / 2;
        System.out.println("Cредний балл оценок по предметам - " + avgScore);
        System.out.println("Средний % по предметам - " + avgPercentage);

        System.out.println("\n8. Расчет годовой прибыли");
        double monthlyPrice = 13025.233;
        double rentalPrice = 5123.018;
        double productionCost = 9001.729;
        double profit = 12 * (monthlyPrice - rentalPrice - productionCost);
        if (profit <= 0) {
            System.out.println("Прибыль за год: " + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + profit + " руб.");
        }

        System.out.println("\n9. Подсчет начисленных банком % с BigDecimal");
        BigDecimal deposit2 = new BigDecimal("321123.59");
        BigDecimal percentage2 = new BigDecimal("0.1");
        if (deposit2.compareTo(BigDecimal.valueOf(100000)) == -1) {
            percentage2 = new BigDecimal("0.05");
        } else if (deposit2.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            percentage2 = new BigDecimal("0.07");
        }
        System.out.println(deposit2 + " - сумма вклада\n" +
                (deposit2.multiply(percentage2).setScale(2, RoundingMode.HALF_DOWN)) +
                " - сумма начисленного %\n" +
                (deposit2.add(deposit2.multiply(percentage2).setScale(2, RoundingMode.HALF_DOWN)) +
                        " - итоговая сумма с %"));

        System.out.println("\n10. Расчет годовой прибыли с BigDecimal");
        BigDecimal monthlyPrice2 = new BigDecimal("13025.233");
        BigDecimal rentalPrice2 = new BigDecimal("5123.018");
        BigDecimal productionCost2 = new BigDecimal("9001.729");
        BigDecimal numberOfMonths = BigDecimal.valueOf(12);
        BigDecimal profitPerYear = monthlyPrice2.multiply(numberOfMonths);
        BigDecimal rentalPerYear = rentalPrice2.multiply(numberOfMonths);
        BigDecimal productionCostPerYear = productionCost2.multiply(numberOfMonths);
        BigDecimal profit2 = profitPerYear.subtract(rentalPerYear.add(productionCostPerYear));
        if ((profit2.compareTo(BigDecimal.ZERO) <= 0)) {
            System.out.println("Прибыль за год: " + profit2.setScale(2, RoundingMode.HALF_DOWN) + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + profit2.setScale(2, RoundingMode.HALF_DOWN) + " руб.");
        }
    }
}