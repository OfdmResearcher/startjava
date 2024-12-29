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
        while (true) {
            enterPlayerNumber(player1, scanner);
            if (isGuessed(targetNumber, player1)) {
                scanner.nextLine();
                break;
            }
            enterPlayerNumber(player2, scanner);
            if (isGuessed(targetNumber, player2)) {
                scanner.nextLine();
                break;
            }
        }
    }

    private void enterPlayerNumber(Player player, Scanner sc) {
        System.out.print("Введите число: ");
        player.setNumber(sc.nextInt());
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