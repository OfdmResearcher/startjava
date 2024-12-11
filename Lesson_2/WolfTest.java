public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Male";
        wolf.nickname = "White Fang";
        wolf.age = 15;
        wolf.weight = 82.5;
        wolf.color = "Light Grey";

        System.out.println(wolf.nickname + " is a " + wolf.gender +
                ".\nThe main characteristics of our wolf:\nAge - " +
                wolf.age + ",\nWeight - " + wolf.weight + ",\nColor - " + wolf.color + ".");
        wolf.sit();
        wolf.walk();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}