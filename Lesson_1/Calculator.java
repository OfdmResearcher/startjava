import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = sc.nextInt();
        int result = 0;
        System.out.println("Введите знак математической операции:");
        sc.nextLine();
        String sign = sc.nextLine();
        if (sign.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (sign.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (sign.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (sign.equals("/")) {
            result = firstNumber / secondNumber;
        } else if (sign.equals("%")) {
            result = firstNumber % secondNumber;
        } else if (sign.equals("^")) {
            result = 1;
            for (int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}