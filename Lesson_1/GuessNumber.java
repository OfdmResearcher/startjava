import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int targetNum = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число:");
            int playerNumber = sc.nextInt();
            if (playerNumber == targetNum) {
                break;
            }
            if (playerNumber > targetNum) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
            }
        }
        System.out.println("Вы победили!");
    }
}