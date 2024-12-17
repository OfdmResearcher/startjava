public class Jaeger {
    private String modelName;
    private String origin;
    private float height;

    public Jaeger() {}

    public Jaeger(String modelName, String origin, float height) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (this.modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("Внимание! Неправильно задана высота робота");
        } else {
            this.height = height;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт!");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли пять шагов");
    }
}