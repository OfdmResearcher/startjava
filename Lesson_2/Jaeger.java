public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private String status;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
        modelName = "Unknown";
        status = "In process";
        height = 2.5f;
    }

    public Jaeger(String modelName, String status, float height) {
        this.modelName = modelName;
        this.status = status;
        this.height = height;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean drift() {
        System.out.println(modelName + ": drift is on");
        return true;
    }

    public void move() {
        if (status.equals("Active")) {
            System.out.println(modelName + " is moving");
        } else {
            System.out.println(modelName + " is repairing");
        }
    }

    public String scanKaiju() {
        return "Scanning enemies";
    }

    public void useVortexCannon() {
        System.out.println("Activated");
    }
}