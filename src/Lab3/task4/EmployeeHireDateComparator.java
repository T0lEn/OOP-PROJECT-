package Lab3.task4;

import java.util.Comparator;

public class EmployeeHireDateComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getHireDate().compareTo(e2.getHireDate());
    }
}
