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
        System.out.print("Имя " + nickname + " начинается с ");
        if (firstCharacter >= 'a' && firstCharacter <= 'z') {
            System.out.println("маленькой буквы " + firstCharacter);
        } else if (firstCharacter >= 'A' && firstCharacter <= 'Z') {
            System.out.println("большой буквы " + firstCharacter);
        } else if (firstCharacter >= '0' && firstCharacter <= '9') {
            System.out.println("цифры " + firstCharacter);
        } else {
            System.out.println("символа " + firstCharacter);
        }

        System.out.print("Имя " + nickname + " начинается с ");
        if (Character.isLowerCase(firstCharacter)) {
            System.out.println("маленькой буквы " + firstCharacter);
        } else if (Character.isUpperCase(firstCharacter)) {
            System.out.println("большой буквы " + firstCharacter);
        } else if (Character.isDigit(firstCharacter)) {
            System.out.println("цифры " + firstCharacter);
        } else {
            System.out.println("символа " + firstCharacter);
        }

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");
        int dbSn = 103;
        int deviceSn = 908;
        if (dbSn == deviceSn) {
            System.out.println("[№" + deviceSn + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            int dbSnHundreds = dbSn / 100;
            int deviceSnHundreds = deviceSn / 100;
            int dbSnTens = dbSn % 100 / 10;
            int deviceSnTens = deviceSn % 100 / 10;
            int dbSnOnes = dbSn % 10;
            int deviceSnOnes = deviceSn % 10;
            boolean hasPartialMatch = (dbSnHundreds == deviceSnHundreds) || 
                    (dbSnTens == deviceSnTens) || (dbSnOnes == deviceSnOnes);
            if (hasPartialMatch) {
                String actualSn = 
                        (dbSnHundreds == deviceSnHundreds ? String.valueOf(deviceSnHundreds) : "_") +
                        (dbSnTens == deviceSnTens ? String.valueOf(deviceSnTens) : "_") +
                        (dbSnOnes == deviceSnOnes ? String.valueOf(deviceSnOnes) : "_");
                System.out.print("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%s]
                        """.formatted(dbSn, actualSn));
            } else {
                System.out.println("[№" + deviceSn + "]: оборудование не идентифицировано");
            }
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        float deposit = 321123.79f;
        float interestRate = 0.1f;
        if (deposit < 100_000) {
            interestRate = 0.05f;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            interestRate = 0.07f;
        }
        float accruedInterestAmount = deposit * interestRate;
        float totalSum = accruedInterestAmount + deposit;
        System.out.println("""
                сумма вклада: %f
                сумма начисленного %%: %f
                итоговая сумма с %%: %f
                """.formatted(deposit, accruedInterestAmount, totalSum));

        BigDecimal depositBd = BigDecimal.valueOf(321123.79);
        BigDecimal interestRateBd = BigDecimal.valueOf(0.1);
        if (depositBd.compareTo(BigDecimal.valueOf(100000)) < 0) {
            interestRateBd = BigDecimal.valueOf(0.05);
        } else if (depositBd.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            interestRateBd = BigDecimal.valueOf(0.07);
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
        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;
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
        BigDecimal annualProfit = 
                monthlyRevenue.subtract(monthlyRent).setScale(2, RoundingMode.HALF_UP)
                .subtract(monthlyProductionCost).setScale(2, RoundingMode.HALF_UP)
                .multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.HALF_UP);
        System.out.print("Прибыль за год: ");
        if (annualProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.print("+");
        }
        System.out.print(annualProfit + " руб.\n");
    }
}