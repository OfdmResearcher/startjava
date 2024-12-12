import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        userInputAndResult(calculator, sc);
        userInputAboutContinuingCalculations(calculator, sc);
    }

    private static void userInputAndResult(Calculator calculator, Scanner sc) {
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
        sc.nextLine();
        char sign = sc.nextLine().charAt(0);
        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();
        calculator.start(firstNumber, secondNumber, sign);
        sc.nextLine();
    }

    private static void userInputAboutContinuingCalculations(Calculator calculator, Scanner sc) {
        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        String userReply = sc.nextLine();
        if (userReply.equals("yes")) {
            userInputAndResult(calculator, sc);
            userInputAboutContinuingCalculations(calculator, sc);
        } else if (userReply.equals("no")) {
            System.out.println("Конец программы");
        } else {
            userInputAboutContinuingCalculations(calculator, sc);
        }
    }
}