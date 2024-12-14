package Lab3.task1;

public class CryptoPayment implements Payment{

    public void pay(double amount) {
        System.out.println("You have paid " + amount + "$ by CryptoPayment");
    }
}
