package LAB2TASK3;
import java.util.*;
public class Bank {
    private Vector<Account> accounts; // Collection of accounts


    public Bank() {
        accounts = new Vector<>();
    }


    public void addAccount(Account account) {
        accounts.add(account);
    }


    public void closeAccount(Account account) {
        accounts.remove(account);
    }


    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingAccount) {
                ((SavingAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }


    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}
