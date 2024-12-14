package Lab3.task1;

public class testInteface {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Payment creditCard = new CreditCard();
        Payment paypal = new PayPal();
        Payment crypto = new CryptoPayment();

        paymentProcessor.processPayment(creditCard, 1000.0);
        paymentProcessor.processPayment(paypal, 3000.0);
        paymentProcessor.processPayment(crypto, 12000.0);
    }
}
