import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String player1Name = sc.nextLine();
        Player player1 = new Player(player1Name);
        System.out.print("Введите имя второго игрока: ");
        String player2Name = sc.nextLine();
        Player player2 = new Player(player2Name);
        GuessNumber game = new GuessNumber(player1, player2);
        game.start(sc);
        while (true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String playerReply = sc.nextLine();
            if (playerReply.equals("yes")) {
                game.start(sc);
            } else if (playerReply.equals("no")) {
                System.out.println("Конец программы");
                break;
            }
        }
    }
}