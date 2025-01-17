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
        makeMove(targetNumber, scanner);
    }

    private void makeMove(int targetNumber, Scanner scanner) {
        Player currPlayer = player1;
        do {
            enterPlayerNumber(currPlayer, scanner);
            boolean isNumberGuessed = isGuessed(targetNumber, currPlayer);
            if (isNumberGuessed) {
                break;
            }
            currPlayer = currPlayer == player1 ? player2 : player1;
        } while (true);
        scanner.nextLine();
    }

    private void enterPlayerNumber(Player player, Scanner scanner) {
        System.out.print("Введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(int targetNumber, Player player) {
        if (player.getNumber() == targetNumber) {
            System.out.println("Выиграл игрок - " + player.getName());
            return true;
        }
        if (player.getNumber() > targetNumber) {
            System.out.println(player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println(player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }
}