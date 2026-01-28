import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();
        Player firstPlayer = new Player(firstPlayerName);

        System.out.println("Имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        Player secondPlayer = new Player(secondPlayerName);

        String answer;
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}