public class Main {
    public static void main(String[] args) {
        doNonBooleanMethods();
        System.out.println();
        doBooleanMethods();
    }

    private static void doNonBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.chooseMenuItem();
        nonBm.calculateAverageMark();
        nonBm.countUniqueWords();
        nonBm.showError();
        nonBm.syncData();
        nonBm.recoverBackupData();
        nonBm.pauseDownload();
        nonBm.resetToDefaults();
        nonBm.writeToFile();
        nonBm.convertTemperature();
        nonBm.enterMathExpression();
        nonBm.findBestPlayer();
        nonBm.findBookByAuthor();
    }

    private static void doBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isFinishedProgram());        
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isEmptyInput());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isPresentFile());
    }
}