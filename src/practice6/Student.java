package practice6;

public class Student extends Person implements CanHavePizza, CanHaveParty, Moveable{
    Student(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }
    @Override
    public void dance(){
        System.out.println(name + " is dancing");
    }
    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza");
    }

}
