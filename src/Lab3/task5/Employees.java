package Lab3.task5;

public class Employees implements Comparable<Employees>{
    public String name;
    public int salary;
    public int age;
    public Employees(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
    @Override
    public int compareTo(Employees o) {
        return this.salary - o.salary;
    }
}
