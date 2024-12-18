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
            System.out.print("Введите число: ");
            player1.setNumber(sc.nextInt());
            int playerNumber1 = player1.getNumber();
            if (playerNumber1 == targetNumber) {
                System.out.println("Выиграл первый игрок - " + player1.getName());
                break;
            }
            if (playerNumber1 > targetNumber) {
                System.out.println(playerNumber1 + " больше того, что загадал компьютер");
            } else {
                System.out.println(playerNumber1 + " меньше того, что загадал компьютер");
            }
            System.out.print("Введите число: ");
            player2.setNumber(sc.nextInt());
            int playerNumber2 = player2.getNumber();
            if (playerNumber2 == targetNumber) {
                System.out.println("Выиграл второй игрок - " + player2.getName());
                break;
            }
            if (playerNumber2 > targetNumber) {
                System.out.println(playerNumber2 + " больше того, что загадал компьютер");
            } else {
                System.out.println(playerNumber2 + " меньше того, что загадал компьютер");
            }
        }
        sc.nextLine();
    }
}