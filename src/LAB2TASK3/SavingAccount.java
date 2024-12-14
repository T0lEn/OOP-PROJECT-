package LAB2TASK3;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterest Rate: " + interestRate + "%";
    }
}
