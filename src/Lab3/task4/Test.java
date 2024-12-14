package Lab3.task4;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", 30, "Female", 50000, new Date(2020, 2, 1), "NI12345");
        Employee emp2 = new Employee("Alice", 25, "Male", 45000, new Date(2021, 1, 15), "NI54321");
        Employee emp3 = new Employee("Charlie", 28, "Male", 55000, new Date(2022, 5, 20), "NI67890");

        // toString and equals
        System.out.println(emp1);
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        // Comparable by salary
        System.out.println("emp1 compareTo emp2: " + emp1.compareTo(emp2));

        Vector<Employee> employees = new Vector<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("\nSorting by name:");
        Collections.sort(employees, new EmployeeNameComparator());
        employees.forEach(System.out::println);

        System.out.println("\nSorting by hire date:");
        Collections.sort(employees, new EmployeeHireDateComparator());
        employees.forEach(System.out::println);

        Employee cloned = emp1.clone();
        System.out.println("\nCloned Employee: " + cloned);

        Manager manager = new Manager("David", 35, "Male", 80000, new Date(118, 3, 10), "NI24680", 10000);
        manager.addTeamMember(emp1);
        manager.addTeamMember(emp2);
        System.out.println("\nManager: " + manager);

        // Cloning Manager
        Manager clonedManager = manager.clone();
        System.out.println("\nCloned Manager: " + clonedManager);

        // Manager Comparison
        Manager manager2 = new Manager("Edward", 40, "Male", 80000, new Date(118, 3, 10), "NI24681", 9000);
        System.out.println("\nmanager compareTo manager2: " + manager.compareTo(manager2));

        // Team change check (deep clone verification)
        clonedManager.addTeamMember(emp3);
        System.out.println("Original Manager team size: " + manager.getTeam().size());
        System.out.println("Cloned Manager team size: " + clonedManager.getTeam().size());

    }
}
