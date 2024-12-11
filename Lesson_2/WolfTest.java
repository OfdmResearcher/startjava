public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Male");
        wolf.setNickname("White Fang");
        wolf.setAge(5);
        wolf.setWeight(82.5);
        wolf.setColor("Light Grey");

        System.out.println(wolf.getNickname() + " is a " + wolf.getGender() +
                ".\nThe main characteristics of our wolf:\nAge - " +
                wolf.getAge() + ",\nWeight - " + wolf.getWeight() + ",\nColor - " + wolf.getColor() + ".");
        wolf.sit();
        wolf.walk();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}