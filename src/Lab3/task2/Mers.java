package Lab3.task2;

public class Mers implements Moveable, Drivable{
    private String name;
    private int year;

    public Mers(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public void move() {
        System.out.println(this.name + " started to move ");
    }
    public void stop() {
        System.out.println(this.name + " stopped");
    }
    public void steer(int direction) {
        System.out.println("Steering " + name + " in direction " + direction);
    }
    public void refuel(int fuel){
        System.out.println("Refueling " + name + " with " + fuel + " liters of fuel");
    }
}
