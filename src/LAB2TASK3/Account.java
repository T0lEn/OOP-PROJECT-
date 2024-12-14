package LAB2TASK3;

public class Account {
    private double balance;
    private int accNumber;
    public Account(int a) {
        this.balance = 0.0;
        this.accNumber = a;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (balance >= sum) {
            balance -= sum;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getAccNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (balance >= amount) {
            this.withdraw(amount);
            other.deposit(amount);
        }
        else {
            System.out.println("Insufficient funds for transfer");
        }
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", accNumber=" + accNumber + "]";

    }
    public final void print(){
        System.out.println(toString());
    }
}
