package LAB2TASK5;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school, boolean healthy, String id) {
        super(name, age, healthy, id);
        this.school = school;
    }

    @Override
    public String getOccupation() {
        return "Student at " + school;
    }
}
