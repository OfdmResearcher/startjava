import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        startCalculator(calculator, sc);
        showUserReply(calculator, sc);
    }

    private static void startCalculator(Calculator calculator, Scanner sc) {
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
        sc.nextLine();
        char sign = sc.nextLine().charAt(0);
        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();
        calculator.calculate(firstNumber, secondNumber, sign);
        sc.nextLine();
    }

    private static void showUserReply(Calculator calculator, Scanner sc) {
        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        String userReply = sc.nextLine();
        if (userReply.equals("yes")) {
            startCalculator(calculator, sc);
            showUserReply(calculator, sc);
        } else if (userReply.equals("no")) {
            System.out.println("Конец программы");
        } else {
            showUserReply(calculator, sc);
        }
    }
}