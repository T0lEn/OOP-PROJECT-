package LAB2TASK5;
import java.util.*;
public class Testik {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog("Laika", 3, true, "3123213");
        Cat cat = new Cat("Murka", 2, false, "29318401");
        Bird bird = new Bird("Mary", 1, true, "8319021");
        Fish fish = new Fish("Bob", 3, true, "3123213");

        Employee amir = new Employee("Amir", 26, "Jusan Bank", true, "213");
        Student aidos = new Student("Aidos", 18, "KBTU", false, "123");
        PhDStudent anuar = new PhDStudent("Anuar", 24, "Finance", true, "415");

        System.out.println(dog + " Sound: " + dog.getSound() + " Healthy: " + dog.isHealthy() + " ID: " + dog.getID());
        System.out.println(cat + " Sound: " + cat.getSound() + " Healthy: " + cat.isHealthy() + " ID: " + cat.getID());
        System.out.println(bird + " Sound: " + bird.getSound() + " Healthy: " + bird.isHealthy() + " ID: " + bird.getID());
        System.out.println(fish + " Sound: " + fish.getSound() + " Healthy: " + fish.isHealthy() + " ID: " + fish.getID());

        System.out.println("\nPeople:");
        System.out.println(aidos + " Occupation: " + aidos.getOccupation());
        System.out.println(anuar + " Occupation: " + anuar.getOccupation());
        System.out.println(amir + " Occupation: " + amir.getOccupation());

        // Связывание людей и животных
        aidos.assignPet(dog);
        anuar.assignPet(cat);

        System.out.println("\nAfter assigning pets:");
        System.out.println(aidos);
        System.out.println(anuar);

        // Передача животного другому человеку
        aidos.leavePetWith(amir);
        System.out.println("\nAfter leaving pet with employee:");
        System.out.println(aidos);
        System.out.println(amir);

        // Клонирование
        Student clonedStudent = (Student) aidos.clone();
        System.out.println("\nCloned student: " + clonedStudent);

        // Сортировка списка животных
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);
        animals.add(fish);

        Collections.sort(animals);
        System.out.println("\nAnimals sorted by age:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        animals.removeIf(animal -> !animal.isHealthy());

        System.out.println("\nAfter removing unhealthy animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }



        // Тестирование compareTo для Person
        System.out.println("\nComparing people by age:");
        System.out.println("Compare student and phdStudent: " + aidos.compareTo(anuar));
        System.out.println("Compare phdStudent and employee: " + anuar.compareTo(amir));
        System.out.println("Compare employee and student: " + aidos.compareTo(aidos));

        // Сортировка списка людей(все здоровы)
        List<Person> people = new ArrayList<>();
        people.add(amir);
        people.add(anuar);
        people.add(aidos);

        Collections.sort(people);
        System.out.println("\nPeople sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }

        people.removeIf(student -> !student.isHealthy());
        System.out.println("\nAfter removing unhealthy students:");
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
