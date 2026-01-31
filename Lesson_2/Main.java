public class Main {
    public static void main(String[] args) {
        doNonBooleanMethods();
        doBooleanMethods();
    }

    public static void doNonBooleanMethods() {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        nonBooleanMethods.findLongestWord();
        nonBooleanMethods.chooseMenuItem();
        nonBooleanMethods.calculateAverageScore();
        nonBooleanMethods.countUniqueWords();
        nonBooleanMethods.showError();
        nonBooleanMethods.synchronizeData();
        nonBooleanMethods.recoverBackupData();
        nonBooleanMethods.pauseDownload();
        nonBooleanMethods.resetSettings();
        nonBooleanMethods.saveDataToFile();
        nonBooleanMethods.convertTemperature();
        nonBooleanMethods.enterMathExpression();
        nonBooleanMethods.findBestPlayer();
        nonBooleanMethods.findBookByAuthor();
    }

    public static void doBooleanMethods() {
        BooleanMethods booleanMethods = new BooleanMethods();
        System.out.println(booleanMethods.isProgramFinished() + "\n");        
        System.out.println(booleanMethods.hasUniqueDigit() + "\n");
        System.out.println(booleanMethods.isLetterEntered() + "\n");
        System.out.println(booleanMethods.hasEqualDigits() + "\n");
        System.out.println(booleanMethods.hasAttemptsLeft() + "\n");
        System.out.println(booleanMethods.isEmptyInput() + "\n");
        System.out.println(booleanMethods.isEvenNumber() + "\n");
        System.out.println(booleanMethods.isValidFilePath() + "\n");
        System.out.println(booleanMethods.isFileExists() + "\n");
    }
}