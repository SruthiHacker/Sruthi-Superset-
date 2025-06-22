public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.makePayment(250.00);

        System.out.println("-----");

        
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(100.00);

        System.out.println("-----");

        
        context.setPaymentStrategy(null);
        context.makePayment(50.00);
    }
}
