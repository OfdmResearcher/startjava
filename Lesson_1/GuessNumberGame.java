import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(1, 101);
        int playerNumber = random.nextInt(1, 101);
        int min = 1;
        int max = 100;
        while (hiddenNumber != playerNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                max = playerNumber - 1;
            } else {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                min = playerNumber + 1;
            }
            playerNumber = random.nextInt(min, max + 1);
        }
        System.out.println("Вы победили!");
    }
}