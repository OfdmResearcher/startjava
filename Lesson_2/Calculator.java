public class Calculator {
    public void start(int firstNumber, int secondNumber, char sign) {
        int result = 0;
        double doubleResult = 0;
        switch (sign) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
                break;
            case '/':
                if (secondNumber != 0) {
                    doubleResult = firstNumber / (double) secondNumber;
                    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + doubleResult);
                } else {
                    System.out.println("Ошибка: деление на ноль запрещено");
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
                break;
            case '^':
                result = 1;
                double resultForNegativeExponentiation = 1;
                if (secondNumber >= 0) {
                    for (int i = 0; i < secondNumber; i++) {
                        result *= firstNumber;
                    }
                    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
                } else {
                    double tempResult = 1;
                    for (int i = 0; i < secondNumber * -1; i++) {
                        tempResult *= firstNumber;
                        resultForNegativeExponentiation = 1 / tempResult;
                    }
                    System.out.println(firstNumber + " " + sign + " " + secondNumber +
                            " = " + resultForNegativeExponentiation);
                }
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
        }
    }
}