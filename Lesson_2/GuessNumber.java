import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner sc) {
        int counter = 0;
        int targetNum = (int) (Math.random() * 100 + 1);
        while (true) {
            System.out.print("Введите число: ");
            int playerNumber = sc.nextInt();
            if (playerNumber == targetNum) {
                break;
            }
            if (playerNumber > targetNum) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
            }
            counter++;
        }
        if (counter % 2 == 0) {
            System.out.println("Выиграл первый игрок - " + player1.getName());
        } else {
            System.out.println("Выиграл второй игрок - " + player2.getName());
        }
    }
}