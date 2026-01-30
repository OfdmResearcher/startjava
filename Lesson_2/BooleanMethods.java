public class BooleanMethods {
    public boolean isProgramFinished() {
        System.out.print(Methods.getMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean hasUniqueDigitSequence() {
        System.out.print(Methods.getMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetterEnteredByUser() {
        System.out.print(Methods.getMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttemptsMarioGame() {
        System.out.print(Methods.getMethodName() + "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isUserInputEmptyString() {
        System.out.print(Methods.getMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumberThrewByComputer() {
        System.out.print(Methods.getMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isValidSsdFilePath() {
        System.out.print(Methods.getMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getMethodName() + 
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}