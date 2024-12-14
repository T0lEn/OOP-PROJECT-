package Lab3.task5;
import Lab3.task4.Employee;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        String[] chocolates = { "Oreo", "Milk", "White", "Dark"};
        Sort.quickSort(chocolates);
        System.out.println(Arrays.toString(chocolates));
        Sort.heapify(chocolates, 0, chocolates.length - 1);
        System.out.println(Arrays.toString(chocolates));

        Time[] times = {new Time(12, 30, 45), new Time(11, 20, 30), new Time(16, 30, 20)};
        Sort.quickSort(times);
        System.out.println(Arrays.toString(times));
        Sort.heapify(times, 2, 3);
        System.out.println(Arrays.toString(times));

        Employees[] employees = {
            new Employees("Aidos", 5500, 23),
            new Employees("Alikhan", 3500, 33),
            new Employees("Bob", 3410, 22)
        };

        Sort.quickSort(employees);
        System.out.println(Arrays.toString(employees));
        Sort.heapify(employees, 2, 3);
        System.out.println(Arrays.toString(employees));
    }
}
