package LAB2TASK5;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Cloneable, HealthyCheck, Identifiable {
    private String name;
    private int age;
    private Animal pet;
    private Animal temporaryPet;
    private boolean healthy;
    private String id;

    public Person(String name, int age, boolean healthy, String id) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for pet
    public Animal getPet() {
        return pet;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            throw new IllegalStateException(this.name + " doesn't have a pet to leave.");
        }

        if (caretaker.isCaringForTemporaryPet()) {
            throw new IllegalStateException(caretaker.getName() + " is already caring for a temporary pet.");
        }

        caretaker.assignTemporaryPet(this.pet);
        this.removePet();
    }

    public void retrievePetFrom(Person caretaker) {
        if (!caretaker.isCaringForTemporaryPet()) {
            throw new IllegalStateException(caretaker.getName() + " is not taking care of any pet.");
        }

        this.assignPet(caretaker.getTemporaryPet());
        caretaker.removeTemporaryPet();
    }

    public void assignTemporaryPet(Animal pet) {
        this.temporaryPet = pet;
    }

    public Animal getTemporaryPet() {
        return temporaryPet;
    }

    public void removeTemporaryPet() {
        this.temporaryPet = null;
    }

    public boolean isCaringForTemporaryPet() {
        return this.temporaryPet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Pet: " + (pet != null ? pet.getName() : "None") +
                (isCaringForTemporaryPet() ? " (Caring for: " + temporaryPet.getName() + ")" : "");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public boolean isHealthy() {
        return healthy;
    }

    @Override
    public String getID(){
        return id;
    }
}
