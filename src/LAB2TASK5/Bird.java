package LAB2TASK5;

public class Bird extends Animal {
    public Bird(String name, int age, boolean healthy, String id) {
        super(name, age, healthy, id);
    }

    @Override
    public String getSound() {
        return "Chirik-chirik";
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
