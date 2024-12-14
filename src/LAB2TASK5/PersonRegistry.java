package LAB2TASK5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRegistry {
    private final List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> findPeopleWithPets() {
        return people.stream().filter(Person::hasPet).collect(Collectors.toList());
    }

    public List<Person> findPeopleWithoutPets() {
        return people.stream().filter(person -> !person.hasPet()).collect(Collectors.toList());
    }

    public void printDetails() {
        people.forEach(System.out::println);
    }
}
