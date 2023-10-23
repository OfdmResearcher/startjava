public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberProcessorCores = 10;
        short processorModel = 12500;
        int ramMemory = 8192;
        long hardDriveMemory = 536_870_912L;
        char processorSerial = 'i';
        boolean isTurnedOn = false;
        float price = 500.35F;
        double processorFrequency = 3.4;

        System.out.println("Количество ядер процессора: " + numberProcessorCores);
        System.out.println("Модель процессора: " + processorModel);
        System.out.println("Оперативная память: " + ramMemory);
        System.out.println("Память жесткого диска: " + hardDriveMemory);
        System.out.println("Серия процессора: " + processorSerial);
        System.out.println("Включен ли компьютер: " + isTurnedOn);
        System.out.println("Цена компьютера: " + price);
        System.out.println("Частота процессора: " + processorFrequency);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice = 100.00;
        double bookPrice = 200.00;
        double discount = 0.11;
        double totalSumWithoutDiscount = penPrice + bookPrice;
        double discountSum = penPrice * discount + bookPrice * discount;
        double totalSumWithDiscount = totalSumWithoutDiscount - discountSum;

        System.out.println("Общая стоимость товаров: " + totalSumWithoutDiscount);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой: " + totalSumWithDiscount);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   j   a  v     v  a");
        System.out.println("   j  a a  v   v  a a");
        System.out.println("j  j aaaaa  v v  aaaaa");
        System.out.println(" jj a     a  v  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2_147_483_647;
        long longValue = Long.MAX_VALUE;

        System.out.println("первоначальное значение: " + byteValue);
        System.out.println("значение после инкремента на единицу: " + ++byteValue);
        System.out.println("значение после декремента на единицу: " + --byteValue);
        System.out.println("первоначальное значение: " + shortValue);
        System.out.println("значение после инкремента на единицу: " + ++shortValue);
        System.out.println("значение после декремента на единицу: " + --shortValue);
        System.out.println("первоначальное значение: " + intValue);
        System.out.println("значение после инкремента на единицу: " + ++intValue);
        System.out.println("значение после декремента на единицу: " + --intValue);
        System.out.println("первоначальное значение: " + longValue);
        System.out.println("значение после инкремента на единицу: " + ++longValue);
        System.out.println("значение после декремента на единицу: " + --longValue);

        System.out.println("\n5. Перестановка значений переменных");
        int firstValue = 2;
        int secondValue = 5;

        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println("Исходные значения: " + firstValue + " и " + secondValue);
        int tempValue = 0;
        tempValue = firstValue;
        firstValue = secondValue;
        secondValue = tempValue;
        System.out.println("Новые значения: " + firstValue + " и " + secondValue);

        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println("Исходные значения: " + firstValue + " и " + secondValue);
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;
        System.out.println("Новые значения: " + firstValue + " и " + secondValue);

        System.out.println("Перестановка  с помощью побитовой операции ^: ");
        System.out.println("Исходные значения: " + firstValue + " и " + secondValue);
        firstValue = firstValue ^ secondValue;
        secondValue = firstValue ^ secondValue;
        firstValue = firstValue ^ secondValue;
        System.out.println("Новые значения: " + firstValue + " и " + secondValue);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollarSymbol = '$';
        char asteriskSymbol = '*';
        char dogSymbol = '@';
        char verticalBarSymbol = '|';
        char tildaSymbol = '~';

        System.out.println(dollarSymbol + "  " + asteriskSymbol + "  " + dogSymbol +
                "   " + verticalBarSymbol + "   " + tildaSymbol);
        System.out.println((int)dollarSymbol + " " + (int)asteriskSymbol + " " + (int)dogSymbol +
                " " + (int)verticalBarSymbol + " " + (int)tildaSymbol);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char openedParenthesis = '(';
        char closedParenthesis = ')';
        char underline = '_';

        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underline +
                openedParenthesis + " " + closedParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underline + underline +
                underline + underline + slash + backslash + underline +
                underline + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = 123/100;
        int tens = 123 % 100 / 10;
        int units = 123 % 100 % 10;
        int sumNumbers = hundreds + tens + units;
        int multiplicationNumbers = hundreds * tens * units;

        System.out.println("Число " + number + " содержит:\n  сотен - " +
                hundreds + "\n  десятков - " + tens + "\n  единиц - " +
                units + "\nСумма его цифр = " + sumNumbers +
                "\nПроизведение = " + multiplicationNumbers);

        System.out.println("\n9. Вывод времени");
        int totalNumberSeconds = 86399;
        int minutesInHour = 60;
        int secondsInHour = 3600;
        int hours = totalNumberSeconds / secondsInHour;
        int minutes = totalNumberSeconds % secondsInHour / minutesInHour;
        int seconds = totalNumberSeconds % secondsInHour % minutesInHour;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}