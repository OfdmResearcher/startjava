import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        final LocalTime startLocalTime = LocalTime.now();
        final double start = System.nanoTime() / 1_000_000_000.0;

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        String firstCaseFirstTaskResult = String.join("\n", "                     /\\", 
                "   J    a  v     v  /  \\", 
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  v v  /      \\",
                " JJ  a     a  v  /___/\\___\\");
        System.out.println(firstCaseFirstTaskResult);
        String secondCaseFirstTaskResult = """
                         /\\            
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """;
        System.out.println(secondCaseFirstTaskResult);

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        float pen = 105.5f;
        float book = 235.23f;
        float discount = 0.11f;
        float withoutDiscountPrice = pen + book;
        float discountSum = (pen + book) * discount;
        float discountPrice = withoutDiscountPrice - discountSum;
        System.out.println("стоимость товаров без скидки: " + withoutDiscountPrice);
        System.out.println("сумма скидки: " + discountSum);
        System.out.println("стоимость товаров со скидкой: " + discountPrice);
        BigDecimal penBd = BigDecimal.valueOf(105.5);
        BigDecimal bookBd = BigDecimal.valueOf(235.23);
        BigDecimal discountBd = BigDecimal.valueOf(0.11);
        BigDecimal withoutDiscountPriceBd = penBd.add(bookBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountSumBd = withoutDiscountPriceBd.multiply(discountBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = withoutDiscountPriceBd.subtract(discountSumBd)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("стоимость товаров без скидки (Bd): " + withoutDiscountPriceBd);
        System.out.println("сумма скидки (Bd): " + discountSumBd);
        System.out.println("стоимость товаров со скидкой (Bd): " + discountPriceBd);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        int firstCell = 2;
        int secondCell = 5;
        System.out.println("Исходные значения переменных:\nfirstCell = " + firstCell + 
                ", secondCell = " + secondCell);
        System.out.println("Метод: третьей переменной ");
        int tempValue = secondCell;
        secondCell = firstCell;
        firstCell = tempValue;
        System.out.println("Результат: firstCell = " + firstCell + ", secondCell = " + secondCell);
        System.out.println("Метод: арифметических операций ");
        firstCell += secondCell;
        secondCell = firstCell - secondCell;
        firstCell -= secondCell;
        System.out.println("Результат: firstCell = " + firstCell + ", secondCell = " + secondCell);
        System.out.println("Метод: побитовой операции ^");
        firstCell ^= secondCell;
        secondCell = firstCell ^ secondCell;
        firstCell ^= secondCell;
        System.out.println("Результат: firstCell = " + firstCell + ", secondCell = " + secondCell);

        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int firstSymbolCode = 1055;
        int secondSymbolCode = 1088;
        int thirdSymbolCode = 1080;
        int fourthSymbolCode = 1074;
        int fifthSymbolCode = 1077;
        int sixthSymbolCode = 1090;
        char firstSymbol = (char) firstSymbolCode;
        char secondSymbol = (char) secondSymbolCode;
        char thirdSymbol = (char) thirdSymbolCode;
        char fourthSymbol = (char) fourthSymbolCode;
        char fifthSymbol = (char) fifthSymbolCode;
        char sixthSymbol = (char) sixthSymbolCode;
        System.out.printf("%-6d %-6d %-6d %-6d %-6d %-6d\n", firstSymbolCode, secondSymbolCode, 
                thirdSymbolCode, fourthSymbolCode, fifthSymbolCode, sixthSymbolCode);
        System.out.printf("%-6c %-6c %-6c %-6c %-6c %-6c\n", firstSymbol, secondSymbol, thirdSymbol, 
                fourthSymbol, fifthSymbol, sixthSymbol);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА");
        int uniqueCode = 753;
        int productCategory = uniqueCode / 100;
        int subCategory = uniqueCode % 100 / 10;
        int packageType = uniqueCode % 10;
        int totalSum = productCategory + subCategory + packageType;
        int verificationCode = productCategory * subCategory * packageType;
        String productInfo = """
                Код товара: %d
                  категория товара - %d
                  под категория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """.formatted(uniqueCode, productCategory, subCategory, packageType, totalSum,
                verificationCode);
        System.out.println(productInfo);

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
        Runtime runtime = Runtime.getRuntime();
        int cores = runtime.availableProcessors();
        long totalMemory = runtime.totalMemory() / 1048576;
        long freeMemory = runtime.freeMemory() / 1048576;
        long runningMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory() / 1048576;
        System.out.println("""
                доступное число ядер: %d
                выделенная память (МБ): %.1f
                свободная память (Мб): %.1f
                используемая память (Мб): %.1f
                максимально доступная для выделения память (Мб): %.1f
                """.formatted(cores, (double) totalMemory, (double) freeMemory, 
                (double) runningMemory, (double) maxMemory));
        String drive = System.getProperty("user.dir").substring(0, System.getProperty("user.dir")
                .indexOf(":") + 1);
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("""
                системный диск (буква): %s
                версия ОС: %s
                версия Java: %s
                символ разделения пути: %s
                """.formatted(drive, osVersion, javaVersion, fileSeparator));

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        double finish = System.nanoTime() / 1_000_000_000.0;
        double timeElapsed = finish - start;
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