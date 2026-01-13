public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = 'м';
        wolf.nickname = "Петр";
        wolf.weight = 90.5;
        wolf.age = 15;
        wolf.color = "Серый";
        System.out.println("Кличка: " + wolf.nickname);
        System.out.println("Пол: " + wolf.gender);
        System.out.println("Окрас: " + wolf.color);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Возраст: " + wolf.age);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunter();
    }
}