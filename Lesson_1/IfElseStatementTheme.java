import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Добро пожаловать в раздел, мужская обувь");
        } else {
            System.out.println("Добро пожаловать в раздел, женская обувь");
        }
        int age = 20;
        if (age > 18) {
            System.out.println("Вы допущены для экзамена по вождению на грузовом транспорте");
        } else {
            System.out.println("Вам отказано в допуске к экзамену");
        }
        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Рекомендуемые секции: футбол или хоккей");
        } else {
            System.out.println("Рекомендуемые секции: баскетбол или волейбол");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");
        int todayStepCount = 1000;
        int yesterdayStepCount = 2000;
        String output = "Вчера шагов было больше";
        if (todayStepCount > yesterdayStepCount) {
            output = "Сегодня шагов было больше";
        } else if (todayStepCount == yesterdayStepCount) {
            output = "Сегодня шагов столько же, как и вчера";
        }
        double averageSteps = (todayStepCount + yesterdayStepCount) / 2.0; 
        System.out.println("""
                Количество шагов за вчера (%d) и сегодня (%d)
                %s
                Среднее значение шагов %.2f
                """.formatted(yesterdayStepCount, todayStepCount, output, averageSteps));

        System.out.println("3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");
        int guestCount = 9;
        if (guestCount == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestCount < 0) {
            System.out.println("Количество гостей не может быть отрицательным!");
        } else if (guestCount % 2 == 0) {
            System.out.println("Записалось " + guestCount + 
                    " гостей. Можно формировать пары для конкурсов.");
        } else {
            System.out.println("Записалось " + guestCount + 
                    " гостей. Нужны индивидуальные задания.");
        }

        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        String nickname = "Bob";
        char firstCharacter = nickname.charAt(0);
        if (firstCharacter > 'a' && firstCharacter < 'z') {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы " + firstCharacter);
        } else if (firstCharacter > 'A' && firstCharacter < 'Z') {
            System.out.println("Имя " + nickname + " начинается с большой буквы " + firstCharacter);
        } else if (firstCharacter > '0' && firstCharacter < '9') {
            System.out.println("Имя " + nickname + " начинается с цифры " + firstCharacter);
        } else {
            System.out.println("Имя " + nickname + " начинается с символа " + firstCharacter);
        }
        if (Character.isLowerCase(firstCharacter)) {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы " + firstCharacter);
        } else if (Character.isUpperCase(firstCharacter)) {
            System.out.println("Имя " + nickname + " начинается с большой буквы " + firstCharacter);
        } else if (Character.isDigit(firstCharacter)) {
            System.out.println("Имя " + nickname + " начинается с цифры " + firstCharacter);
        } else {
            System.out.println("Имя " + nickname + " начинается с символа " + firstCharacter);
        }

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");
        int serialNumber = 123;
        int deviceNumber = 908;
        int serialNumberHundreds = serialNumber / 100;
        int deviceNumberHundreds = deviceNumber / 100;
        int serialNumberTens = serialNumber % 100 / 10;
        int deviceNumberTens = deviceNumber % 100 / 10;
        int serialNumberOnes = serialNumber % 10;
        int deviceNumberOnes = deviceNumber % 10;
        boolean hasPartialMatch = (serialNumberHundreds == deviceNumberHundreds ? true : false) || 
                (serialNumberTens == deviceNumberTens ? true : false) || 
                (serialNumberOnes == deviceNumberOnes ? true : false);
        if (serialNumber == deviceNumber) {
            System.out.println("[№" + deviceNumber + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            if (hasPartialMatch) {
                System.out.print("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%d]
                        """.formatted(serialNumber, deviceNumber));
            } else {
                System.out.println("[№" + deviceNumber + "]: оборудование не идентифицировано");
            }
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        float deposit = 321123.79f;
        float interestRate = 0;
        if (deposit < 100_000) {
            interestRate = 0.05f;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            interestRate = 0.07f;
        } else {
            interestRate = 0.1f;
        }
        float accruedInterestAmount = deposit * interestRate;
        float totalSum = accruedInterestAmount + deposit;
        System.out.println("""
                сумма вклада: %f
                сумма начисленного %%: %f
                итоговая сумма с %%: %f
                """.formatted(deposit, accruedInterestAmount, totalSum));

        BigDecimal depositBd = BigDecimal.valueOf(321123.79);
        BigDecimal interestRateBd;
        if (depositBd.compareTo(BigDecimal.valueOf(100000)) < 0) {
            interestRateBd = BigDecimal.valueOf(0.05);
        } else if (depositBd.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            interestRateBd = BigDecimal.valueOf(0.07);
        } else {
            interestRateBd = BigDecimal.valueOf(0.1);
        }
        BigDecimal accruedInterestAmountBd = depositBd.multiply(interestRateBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalSumBd = accruedInterestAmountBd.add(depositBd)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("""
                сумма вклада: %s
                сумма начисленного %%: %s
                итоговая сумма с %%: %s
                """.formatted(depositBd, accruedInterestAmountBd, totalSumBd));

        System.out.println("7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        }
        int programmingPercent = 92;
        int programmingGrade = 5;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        }
        double averageGrade = (historyGrade + programmingGrade) / 2;
        double averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("""
                История - %s
                Программирование - %s
                Средний балл оценок по предметам - %.2f
                Средний %% по предметам - %.2f
                """.formatted(historyGrade, programmingGrade, averageGrade, averagePercent));

        System.out.println("8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        BigDecimal monthlyRevenue = BigDecimal.valueOf(13025.233);
        BigDecimal monthlyRent = BigDecimal.valueOf(5123.018);
        BigDecimal monthlyProductionCost = BigDecimal.valueOf(9001.729);
        BigDecimal monthCount = BigDecimal.valueOf(12);
        BigDecimal annualRevenue = monthlyRevenue.multiply(monthCount)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal annualRent = monthlyRent.multiply(monthCount).setScale(2, RoundingMode.HALF_UP);
        BigDecimal annualProductionCost = monthlyProductionCost.multiply(monthCount)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal annualProfit = annualRevenue.subtract(annualRent)
                .setScale(2, RoundingMode.HALF_UP)
                .subtract(annualProductionCost).setScale(2, RoundingMode.HALF_UP);
        System.out.print("Прибыль за год: ");
        if (annualProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.print("+");
        }
        System.out.print(annualProfit + " руб.\n");
    }
}