public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setStatus("Destroyed");
        strikerEureka.setHeight(2.1f);
        System.out.println("modelName = " + strikerEureka.getModelName());
        System.out.println("status = " + strikerEureka.getStatus());
        System.out.println("height = " + strikerEureka.getHeight());
        strikerEureka.drift();
        strikerEureka.move();
        System.out.println();

        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Active", 2.3f);
        System.out.println("modelName = " + gipsyDanger.getModelName());
        System.out.println("status = " + gipsyDanger.getStatus());
        System.out.println("height = " + gipsyDanger.getHeight());
        gipsyDanger.drift();
        gipsyDanger.move();
    }
}