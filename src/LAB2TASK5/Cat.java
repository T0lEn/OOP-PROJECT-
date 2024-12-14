package LAB2TASK5;

public class Cat extends Animal {
    public Cat(String name, int age, boolean healthy, String id) {
        super(name, age, healthy, id);
    }

    @Override
    public String getSound() {
        return "Meow";
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
