public class BooleanMethods {
    public boolean isProgramFinished() {
        System.out.print(Methods.getMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Methods.getMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isSingleLetterEntered() {
        System.out.print(Methods.getMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasRemainingAttempts() {
        System.out.print(Methods.getMethodName() + "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isInputEmpty() {
        System.out.print(Methods.getMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.print(Methods.getMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isPathValid() {
        System.out.print(Methods.getMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isFilePresent() {
        System.out.print(Methods.getMethodName() + 
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}