package LAB2TASK5;

public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company, boolean healthy, String id) {
        super(name, age, healthy, id);
        this.company = company;
    }

    @Override
    public String getOccupation() {
        return "Employee at " + company;
    }
}
