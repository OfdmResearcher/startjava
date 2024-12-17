public class Calculator {
    public void calculate(int firstNumber, int secondNumber, char sign) {
        double result = 0;
        switch (sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    break;
                }
                result = firstNumber / (double) secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < Math.abs(secondNumber); i++) {
                    result *= firstNumber;
                }
                result = secondNumber < 0 ? 1 / result : result;
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}