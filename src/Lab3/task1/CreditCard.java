package Lab3.task1;

public class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paying " + amount + " credit card");
    }
}
