package Lab3.task4;
import java.util.*;

public class Employee extends Person implements Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, int age, String gender, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name, age, gender);
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    public Employee(String name, double annualSalary, Date hireDate) {
        super(name, 0, "Unknown");
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = "Unknown";
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Annual Salary: " + annualSalary +
                ", Hire Date: " + hireDate +
                ", National Insurance Number: " + nationalInsuranceNumber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(nationalInsuranceNumber, employee.nationalInsuranceNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), annualSalary, hireDate, nationalInsuranceNumber);
    }

    public int compareTo(Employee employee) {
        return Double.compare(this.getAnnualSalary(), employee.getAnnualSalary());
    }

    //deep cloning by hiredate
    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) this.hireDate.clone();
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
