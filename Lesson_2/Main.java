public class Main {
    public static void main(String[] args) {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        BooleanMethods booleanMethods = new BooleanMethods();
        callNonBooleanMethods(nonBooleanMethods);
        callBooleanMethods(booleanMethods);
    }

    public static void callNonBooleanMethods(NonBooleanMethods nonBooleanMethods) {
        nonBooleanMethods.findJavaBookSentenceLongestWord();
        nonBooleanMethods.chooseMacOsTextEditorMenuItem();
        nonBooleanMethods.findSchool1234AverageScore();
        nonBooleanMethods.countWarAndPeaceUniqueWords();
        nonBooleanMethods.showError();
        nonBooleanMethods.synchronizeCloudStorageData();
        nonBooleanMethods.recoverBackupFrom11032024Data();
        nonBooleanMethods.stopMp3FileDownload();
        nonBooleanMethods.resetMiVacuumCleanerSettings();
        nonBooleanMethods.recordUsbDriveFilePathData();
        nonBooleanMethods.convertCelsiusToFahrenheitTemperature();
        nonBooleanMethods.enterThreeArgumentsMathExpression();
        nonBooleanMethods.findNeedForSpeedGameBestPlayer();
        nonBooleanMethods.findAuthorNameBook();
    }

    public static void callBooleanMethods(BooleanMethods booleanMethods) {
        System.out.println(booleanMethods.isProgramFinished() + "\n");        
        System.out.println(booleanMethods.hasUniqueDigitSequence() + "\n");
        System.out.println(booleanMethods.isLetterEnteredByUser() + "\n");
        System.out.println(booleanMethods.hasEqualDigits() + "\n");
        System.out.println(booleanMethods.hasAttemptsMarioGame() + "\n");
        System.out.println(booleanMethods.isUserInputEmptyString() + "\n");
        System.out.println(booleanMethods.isEvenNumberThrewByComputer() + "\n");
        System.out.println(booleanMethods.isValidSsdFilePath() + "\n");
        System.out.println(booleanMethods.isExistFile() + "\n");
    }
}