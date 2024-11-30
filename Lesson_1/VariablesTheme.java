import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte cpuCores = 10;
        short cpuModel = 12500;
        int ramSize = 8192;
        long hddCapacity = 536_870_912L;
        char cpuSerial = 'i';
        boolean isTurnedOn = false;
        float price = 500.35F;
        double cpuFrequency = 3.4;

        System.out.println("Количество ядер процессора: " + cpuCores);
        System.out.println("Модель процессора: " + cpuModel);
        System.out.println("Оперативная память: " + ramSize);
        System.out.println("Память жесткого диска: " + hddCapacity);
        System.out.println("Серия процессора: " + cpuSerial);
        System.out.println("Включен ли компьютер: " + isTurnedOn);
        System.out.println("Цена компьютера: " + price);
        System.out.println("Частота процессора: " + cpuFrequency);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discount = 0.11;
        double basePrice = penPrice + bookPrice;
        double discountSum = discount * (penPrice + bookPrice);
        double discountPrice = basePrice - discountSum;

        System.out.println("Стоимость товаров без скидки: " + basePrice);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   j   a  v     v  a");
        System.out.println("   j  a a  v   v  a a");
        System.out.println("j  j aaaaa  v v  aaaaa");
        System.out.println(" jj a     a  v  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2_147_483_647;
        long longMax = Long.MAX_VALUE;
        char charMax = Character.MAX_VALUE;

        System.out.println("первоначальное значение: " + byteMax);
        System.out.println("значение после инкремента на единицу: " + ++byteMax);
        System.out.println("значение после декремента на единицу: " + --byteMax);
        System.out.println("первоначальное значение: " + shortMax);
        System.out.println("значение после инкремента на единицу: " + ++shortMax);
        System.out.println("значение после декремента на единицу: " + --shortMax);
        System.out.println("первоначальное значение: " + intMax);
        System.out.println("значение после инкремента на единицу: " + ++intMax);
        System.out.println("значение после декремента на единицу: " + --intMax);
        System.out.println("первоначальное значение: " + longMax);
        System.out.println("значение после инкремента на единицу: " + ++longMax);
        System.out.println("значение после декремента на единицу: " + --longMax);
        System.out.println("первоначальное значение: " + charMax);
        System.out.println("значение после инкремента на единицу: " + ++charMax);
        System.out.println("значение после декремента на единицу: " + --charMax);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println("Исходные значения: " + a + " и " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения: " + a + " и " + b);

        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println("Исходные значения: " + a + " и " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения: " + a + " и " + b);

        System.out.println("Перестановка  с помощью побитовой операции ^: ");
        System.out.println("Исходные значения: " + a + " и " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения: " + a + " и " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilda = '~';

        System.out.println(dollar + "  " + asterisk + "  " + atSign +
                "   " + verticalBar + "   " + tilda);
        System.out.println((int) dollar + " " + (int) asterisk + " " + (int) atSign +
                " " + (int) verticalBar + " " + (int) tilda);

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

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        int numbersSum = hundreds + tens + ones;
        int numbersProduct = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит:\n  сотен - " +
                hundreds + "\n  десятков - " + tens + "\n  единиц - " +
                ones + "\nСумма его цифр = " + numbersSum +
                "\nПроизведение = " + numbersProduct);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = totalSeconds % 3600 / 60;
        int ss = totalSeconds % 60;

        System.out.println(hh + ":" + mm + ":" + ss);

        System.out.println("\n10. Расчет стоимости товара со скидкой");
        BigDecimal penPrice2 = new BigDecimal("105.5");
        BigDecimal bookPrice2 = new BigDecimal("235.83");
        BigDecimal discount2 = new BigDecimal("0.11");
        BigDecimal basePrice2 = penPrice2.add(bookPrice2).setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal discountSum2 = discount2.multiply(basePrice2).setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal discountPrice2 = basePrice2.subtract(discountSum2).setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("Стоимость товаров без скидки: " + basePrice2);
        System.out.println("Сумма скидки: " + discountSum2);
        System.out.println("Стоимость товаров со скидкой: " + discountPrice2);
    }
}