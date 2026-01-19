public class Calculator {
    public void calculate(int firstNumber, int secondNumber, char sign) {
        if (secondNumber == 0 && (sign == '/' || sign == '%')) {
            System.out.println("Ошибка: деление на ноль запрещено");
            return;
        }
        int result = 0;
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
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                if (firstNumber == 0 && (secondNumber < 0 || secondNumber == 0)) {
                    System.out.println("Ошибка: возведение ноля" + 
                            " в нулевую или отрицательную степень запрещено");
                    return;
                } 
                result = 1;
                int exponent = Math.abs(secondNumber);
                for (int i = 0; i < exponent; i++) {
                    result *= firstNumber;
                }
                if (secondNumber < 0) {
                    double doubleResult = 1.0 / result;
                    System.out.println("Результат вычисления: " + doubleResult);
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
                return;
        }
        System.out.println("Результат вычисления: " + result);
    }
}