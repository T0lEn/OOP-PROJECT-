import java.util.Objects;

public class Employee extends Car {
    private String employeeId;

    public Employee(String name, double price, String employeeId) {
        super(name, price);
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }

    // Getters and setters for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
