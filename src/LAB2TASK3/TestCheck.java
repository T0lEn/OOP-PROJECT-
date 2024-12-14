package LAB2TASK3;

public class TestCheck {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount saving = new SavingAccount(1001, 5.0);
        CheckingAccount checking = new CheckingAccount(1002);

        // Add accounts to the bank
        bank.addAccount(saving);
        bank.addAccount(checking);

        // Perform some operations
        saving.deposit(1000);
        checking.deposit(500);


        bank.update();


        bank.printAccounts();
    }
}
