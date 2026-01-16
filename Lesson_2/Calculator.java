public class Calculator {
    public void calculate(int firstNumber, int secondNumber, char sign) {
        switch (sign) {
            case '+':
                System.out.println("Результат вычисления: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Результат вычисления: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Результат вычисления: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println("Результат вычисления: " + (firstNumber / secondNumber));
                }
                break;
            case '%':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println("Результат вычисления: " + (firstNumber % secondNumber));
                }
                break;
            case '^':
                if (firstNumber == 0 && (secondNumber < 0 || secondNumber == 0)) {
                    System.out.println("Ошибка: возведение ноля" + 
                            " в нулевую или отрицательную степень запрещено");
                } else {
                    double result = 1;
                    int absoluteValue = secondNumber < 0 ? secondNumber * -1 : secondNumber;
                    for (int i = 0; i < absoluteValue; i++) {
                        if (secondNumber > 0) {
                            result *= firstNumber;
                        } else {
                            result = result * (1.0 / firstNumber);
                        }
                    }
                    if (secondNumber < 0) {
                        System.out.println("Результат вычисления: " + result);
                    } else {
                        System.out.println("Результат вычисления: " + (int) result);
                    }
                }
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
        }
    }
}