import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась: попробуйте отгадать число в диапазоне от 1 до 100");
        int hiddenNumber = (int) (Math.random() * 100) + 1;

        while (true) {
            if (isGuessed(firstPlayer, scanner, hiddenNumber)) {
                return;
            }
            if (isGuessed(secondPlayer, scanner, hiddenNumber)) {
                return;
            }
        }
    }

    private boolean isGuessed(Player player, Scanner scanner, int hiddenNumber) {
        player.setNumber(enterNumber(player, scanner));
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Выиграл: " + player.getName());
            return true;
        } 
        if (player.getNumber() > hiddenNumber) {
            System.out.println("Введенное число больше загаданного!");
            return false;
        } 
        System.out.println("Введенное число меньше загаданного!");
        return false;
    }

    private int enterNumber(Player player, Scanner scanner) {
        System.out.println("Игрок " + player.getName() + ", введите число: ");
        return scanner.nextInt();
    }
}