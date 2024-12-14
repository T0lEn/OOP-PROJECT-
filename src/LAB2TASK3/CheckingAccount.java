package LAB2TASK3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02; // Fee per transaction after free limit


    public CheckingAccount(int accNumber) {
        super(accNumber);
        transactionCount = 0;
    }


    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
        deductFee();
    }


    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
        deductFee();
    }


    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Transactions: " + transactionCount;
    }
}
