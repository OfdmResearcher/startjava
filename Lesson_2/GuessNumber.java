import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner scanner) {
        int targetNumber = (int) (Math.random() * 100 + 1);
        checkNumbers(player1, player2, targetNumber, scanner);
    }

    private int enterPlayerNumber(Player player, Scanner sc) {
        System.out.print("Введите число: ");
        player.setNumber(sc.nextInt());
        return player.getNumber();
    }

    private boolean isPlayerNumberEqualsTargetNumber(int playerNumber, int targetNumber, Player player) {
        if (playerNumber == targetNumber) {
            System.out.println("Выиграл игрок - " + player.getName());
            return true;
        }
        if (playerNumber > targetNumber) {
            System.out.println(playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println(playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void checkNumbers(Player player1, Player player2, int targetNumber, Scanner scanner) {
        while (true) {
            int playerNumber1 = enterPlayerNumber(player1, scanner);
            if (isPlayerNumberEqualsTargetNumber(playerNumber1, targetNumber, player1)) {
                scanner.nextLine();
                break;
            }
            int playerNumber2 = enterPlayerNumber(player2, scanner);
            if (isPlayerNumberEqualsTargetNumber(playerNumber2, targetNumber, player2)) {
                scanner.nextLine();
                break;
            }
        }
    }
}