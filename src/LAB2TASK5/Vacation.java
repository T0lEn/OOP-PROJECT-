package LAB2TASK5;

class Vacation {
    public static void leavePetWith(Person owner, Person caretaker) {
        if (!owner.hasPet()) {
            System.out.println(owner.getName() + " has no pet to leave.");
            return;
        }

        if (caretaker.isCaringForTemporaryPet()) {
            System.out.println(caretaker.getName() + " is already caring for a temporary pet.");
            return;
        }

        Animal pet = owner.getPet();
        owner.removePet();
        caretaker.assignTemporaryPet(pet);
        System.out.println(owner.getName() + " left " + pet.getName() + " with " + caretaker.getName());
    }

    public static void retrievePetFrom(Person owner, Person caretaker) {
        if (!caretaker.isCaringForTemporaryPet()) {
            System.out.println(caretaker.getName() + " has no pet to return.");
            return;
        }

        Animal pet = caretaker.getTemporaryPet();
        caretaker.removeTemporaryPet();
        owner.assignPet(pet);
        System.out.println(owner.getName() + " retrieved " + pet.getName() + " from " + caretaker.getName());
    }
}
