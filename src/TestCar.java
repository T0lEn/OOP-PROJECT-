import java.util.HashSet;
public class TestCar {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tesla", 50000.0, "EMP001");
        Employee emp2 = new Employee("Tesla", 50000.0, "EMP001");
        Employee emp3 = new Employee("BMW", 45000.0, "EMP002");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2)); // true
        System.out.println("emp1 equals emp3: " + emp1.equals(emp3)); // false


        HashSet<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Количество уникальных сотрудников: " + employees.size()); // Должно быть 2
        System.out.println("Сотрудники в наборе:");
        for (Employee e : employees) {
            System.out.println(e.toString());}
    }
}
