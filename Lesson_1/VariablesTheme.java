import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final LocalTime startLocalTime = LocalTime.now();
        final double start = System.nanoTime();

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println(String.join(
                "\n", "                     /\\", 
                "   J    a  v     v  /  \\", 
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  v v  /      \\",
                " JJ  a     a  v  /___/\\___\\"));
        System.out.println("""
                \n         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """);

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discount = 0.11f;
        float basePrice = penPrice + bookPrice;
        float discountSum = (penPrice + bookPrice) * discount;
        float discountPrice = basePrice - discountSum;
        System.out.println("стоимость товаров без скидки: " + basePrice);
        System.out.println("сумма скидки: " + discountSum);
        System.out.println("стоимость товаров со скидкой: " + discountPrice);

        BigDecimal penPriceBd = BigDecimal.valueOf(105.5);
        BigDecimal bookPriceBd = BigDecimal.valueOf(235.23);
        BigDecimal discountBd = BigDecimal.valueOf(0.11);
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountSumBd = basePriceBd.multiply(discountBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountSumBd)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("стоимость товаров без скидки (Bd): " + basePriceBd);
        System.out.println("сумма скидки (Bd): " + discountSumBd);
        System.out.println("стоимость товаров со скидкой (Bd): " + discountPriceBd);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        int cellA = 2;
        int cellB = 5;
        System.out.println("Исходные значения переменных:\n" + 
                "A1 = " + cellA + ", B1 = " + cellB);
        System.out.println("Метод: третьей переменной ");
        int temp = cellB;
        cellB = cellA;
        cellA = temp;
        System.out.println("Результат: A1 = " + cellA + ", B1 = " + cellB);
        System.out.println("Метод: арифметических операций ");
        cellA += cellB;
        cellB = cellA - cellB;
        cellA -= cellB;
        System.out.println("Результат: A1 = " + cellA + ", B1 = " + cellB);
        System.out.println("Метод: побитовой операции ^");
        cellA ^= cellB;
        cellB ^= cellA;
        cellA ^= cellB;
        System.out.println("Результат: A1 = " + cellA + ", B1 = " + cellB);

        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
        System.out.printf("%-6d %-6d %-6d %-6d %-6d %-6d\n", 
                code1, code2, code3, code4, code5, code6);
        System.out.printf("%-6c %-6c %-6c %-6c %-6c %-6c\n", 
                code1, code2, code3, code4, code5, code6);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА");
        int uniqueCode = 753;
        int productCategory = uniqueCode / 100;
        int subcategory = uniqueCode % 100 / 10;
        int packageType = uniqueCode % 10;
        int checksum = productCategory + subcategory + packageType;
        int verificationCode = productCategory * subcategory * packageType;
        System.out.println("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """.formatted(uniqueCode, productCategory, subcategory, 
                packageType, checksum, verificationCode));

        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        System.out.println("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(temperature, ++temperature, --temperature));
        short pressure = Short.MAX_VALUE;
        System.out.println("""
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(pressure, ++pressure, --pressure));
        int distance = Integer.MAX_VALUE;
        System.out.println("""
                [Пройденное расстояние, мм]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(distance, ++distance, --distance));
        long elapsedTime = Long.MAX_VALUE;
        System.out.println("""
                [Время с момента старта, с]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(elapsedTime, ++elapsedTime, --elapsedTime));
        char conditionCode = Character.MAX_VALUE;
        System.out.println("""
                [Код состояния системы, число]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted((int) conditionCode, (int) ++conditionCode, (int) --conditionCode));

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime rt = Runtime.getRuntime();
        int processors = rt.availableProcessors();
        final float bytesPerMegabyte = 1024 * 1024;
        float totalMemory = rt.totalMemory() / bytesPerMegabyte;
        float freeMemory = rt.freeMemory() / bytesPerMegabyte;
        float usedMemory = totalMemory - freeMemory;
        float maxMemory = rt.maxMemory() / bytesPerMegabyte;
        System.out.println("""
                доступное число ядер: %d
                выделенная память (МБ): %.1f
                свободная память (Мб): %.1f
                используемая память (Мб): %.1f
                максимально доступная для выделения память (Мб): %.1f
                """.formatted(processors, totalMemory, freeMemory, usedMemory, maxMemory));

        char drive = System.getProperty("user.dir").charAt(0);
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("""
                системный диск (буква): %c
                версия ОС: %s
                версия Java: %s
                символ разделения пути: %s
                """.formatted(drive, osVersion, javaVersion, fileSeparator));

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        double finish = System.nanoTime();
        double timeElapsed = (finish - start) / 1e9;
        LocalTime endLocalTime = LocalTime.now();
        System.out.println("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %.3f сек    |
                """.formatted(dtf.format(startLocalTime), dtf.format(endLocalTime), timeElapsed));
    }
}