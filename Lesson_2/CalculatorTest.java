import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isProgramFinished = true;
        while (isProgramFinished) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(firstNumber, secondNumber, operation);
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                String answer = scanner.next();
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    isProgramFinished = false;
                    break;
                } else {
                    continue;
                }
            }
        }
    }
}