package Lab3.task4;

import java.util.*;
public class Manager extends Employee implements Comparable<Manager> {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, int age, String gender, double annualSalary, Date hireDate,
                   String nationalInsuranceNumber, double bonus) {
        super(name, age, gender, annualSalary, hireDate, nationalInsuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }
    public Manager(String name, double annualSalary, Date hireDate, double bonus){
        super(name, annualSalary, hireDate);
        this.bonus = bonus;
        this.team = new Vector<>();

    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void addTeamMember(Employee e) {
        team.add(e);
    }
    public void removeTeamMember(Employee e) {
        team.remove(e);
    }
    public Vector<Employee> getTeam() {
        return team;
    }


    @Override
    public String toString() {
        return super.toString() + "\nTeam size: " + team + "\nBonus: " + bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;

        return Double.compare(manager.bonus, bonus) == 0 && Objects.equals(team, manager.team);

    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, bonus);
    }

    @Override
    public int compareTo(Manager o) {
        int salaryComparison = Double.compare(this.getAnnualSalary(), o.getAnnualSalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        return Double.compare(this.bonus, o.bonus);
    }

    @Override
    public Manager clone(){
        Manager manager = (Manager) super.clone();
        manager.team = new Vector<>();
        for (Employee employee : this.team) {
            manager.team.add(employee.clone());
        }
        return manager;
    }
}
