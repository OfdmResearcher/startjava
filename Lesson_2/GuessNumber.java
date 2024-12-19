import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner sc) {
        int targetNumber = (int) (Math.random() * 100 + 1);
        while (true) {
            if (targetNumber == enterPlayerNumber(player1, targetNumber, sc)) {
                sc.nextLine();
                break;
            }
            if (targetNumber == enterPlayerNumber(player2, targetNumber, sc)) {
                sc.nextLine();
                break;
            }
        }
    }

    private int enterPlayerNumber(Player player, int targetNumber, Scanner sc) {
        System.out.print("Введите число: ");
        player.setNumber(sc.nextInt());
        int playerNumber = player.getNumber();
        if (playerNumber == targetNumber) {
            System.out.println("Выиграл игрок - " + player.getName());
            return targetNumber;
        }
        if (playerNumber > targetNumber) {
            System.out.println(playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println(playerNumber + " меньше того, что загадал компьютер");
        }
        return playerNumber;
    }
}