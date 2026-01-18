import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(firstNumber, secondNumber, operation);

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            }
        }
    }
}