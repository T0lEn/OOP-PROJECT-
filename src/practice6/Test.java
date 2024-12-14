package practice6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Student student = new Student("Alex");

        Resturant restaurant = new Resturant();

        System.out.println("Serving pizza to the cat:");
        restaurant.servePizza(cat);

        System.out.println("\nServing pizza to the student:");
        restaurant.servePizza(student);

        System.out.println  ("\nStudent additional activities:");
        student.dance();
        student.move();
    }
}
