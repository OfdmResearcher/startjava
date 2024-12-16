public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25f);
        System.out.println("Jaeger: " + gipsyDanger.getModelName() + "\nOrigin: " + gipsyDanger.getOrigin() +
                "\nHeight: " + gipsyDanger.getHeight());
        gipsyDanger.drift();
        gipsyDanger.move();

        System.out.println("-----------------------");

        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "China", 76.2f);
        System.out.println("Jaeger: " + crimsonTyphoon.getModelName() + "\nOrigin: " + 
                crimsonTyphoon.getOrigin() + "\nHeight: " + crimsonTyphoon.getHeight());
        crimsonTyphoon.move();
        crimsonTyphoon.move();
        crimsonTyphoon.drift();
    }
}