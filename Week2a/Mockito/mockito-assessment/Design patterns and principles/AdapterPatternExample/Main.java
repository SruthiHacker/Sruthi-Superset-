public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment(150.0);

        System.out.println("-----");

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(300.0);
    }
}
