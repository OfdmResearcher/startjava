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
            System.out.println("Игрок " + firstPlayer.getName() + ", введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            if (firstPlayer.getNumber() == hiddenNumber) {
                System.out.println("Выиграл: " + firstPlayer.getName());
                break;
            } else if (firstPlayer.getNumber() > hiddenNumber) {
                System.out.println("Введенное число больше загаданного!");
            } else {
                System.out.println("Введенное число меньше загаданного!");
            }

            System.out.println("Игрок " + secondPlayer.getName() + ", введите число: ");
            secondPlayer.setNumber(scanner.nextInt());
            if (secondPlayer.getNumber() == hiddenNumber) {
                System.out.println("Выиграл: " + secondPlayer.getName());
                break;
            } else if (secondPlayer.getNumber() > hiddenNumber) {
                System.out.println("Введенное число больше загаданного!");
            } else {
                System.out.println("Введенное число меньше загаданного!");
            }
        }
    }
}