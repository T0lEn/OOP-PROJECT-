package Lab3.task1;

public class PayPal implements Payment{
    public void pay(double amount) {
        System.out.println(amount + " payment is paid by PayPal.");
    }
}
