package LAB2TASK5;

public abstract class Animal implements Comparable<Animal>, Cloneable, HealthyCheck, Identifiable{
    private String name;
    private int age;
    private boolean healthy;
    private String id;

    public Animal(String name, int age, boolean healthy, String id) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getSound();

    @Override
    public String toString() {

        return "Animal: " + name + ", Age: " + age;
    }

    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public boolean isHealthy(){
        return healthy;
    }

    public String getID(){
        return id;
    }
}
