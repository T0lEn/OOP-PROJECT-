package Lab3.task2;

public class Bugatti implements Moveable, Drivable{
    private String name;
    private int year;
    public Bugatti(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public void move() {
        System.out.println(name + " Started to move ");
    }
    public void stop() {
        System.out.println(name + " stoped ");
    }
    public void steer(int direction){
        System.out.println("Steering " + name + " in direction " + direction);
    }
    public void refuel(int fuel){
        System.out.println("Refueling " + name + " with " + fuel + " liters of fuel");
    }
}
