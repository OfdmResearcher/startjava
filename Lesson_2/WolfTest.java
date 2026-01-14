public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender('м');
        wolf.setNickname("Петр");
        wolf.setWeight(90.5);
        wolf.setAge(15);
        wolf.setColor("Серый");
        System.out.println("Кличка: " + wolf.getNickname());
        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Окрас: " + wolf.getColor());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}