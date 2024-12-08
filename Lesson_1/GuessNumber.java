import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        while (computerNumber != 0) {
            System.out.println("Введите число:");
            int playerNumber = sc.nextInt();
            if (playerNumber > computerNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
            } else if (playerNumber < computerNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
                computerNumber -= playerNumber;
            }
        }
    }
}