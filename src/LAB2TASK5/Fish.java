package LAB2TASK5;

public class Fish extends Animal {
    public Fish(String name, int age, boolean healthy, String id) {
        super(name, age, healthy, id);
    }

    @Override
    public String getSound() {
        return "Bulb";
    }

    @Override
    public boolean isHealthy() {
        return super.isHealthy();
    }
}
