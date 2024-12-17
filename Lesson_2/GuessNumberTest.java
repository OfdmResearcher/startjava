import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String player1Name = sc.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String player2Name = sc.nextLine();
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.start(sc);
    }
}