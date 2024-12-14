package Lab3.task2;

public class testCar {
    public static void main(String[] args) {
        Bugatti bugatti = new Bugatti("Chiron", 2020);
        Mers mers = new Mers("Mers S class", 2022);

        bugatti.move();
        mers.move();
        bugatti.stop();
        mers.stop();
        bugatti.steer(250);
        mers.steer(100);
        bugatti.move();
        mers.move();
        bugatti.stop();
        mers.stop();
        bugatti.refuel(60);
        mers.refuel(50);
    }
}
