package LAB2TASK5;

public class Dog extends Animal {
    public Dog(String name, int age, boolean healthy, String id) {
        super(name, age, healthy, id);
    }

    @Override
    public String getSound() {
        return "Gaf";
    }

    @Override
    public boolean isHealthy(){
        return super.isHealthy();
    }

    @Override
    public String getID() {
        return super.getID();
    }
}
