public class Main {
    public static void main(String[] args) {
        // Base notifier (email only)
        Notifier notifier = new EmailNotifier();
        notifier.send("Welcome to Decorator Pattern!");

        System.out.println("-----");

        // Email + SMS
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("OTP Code: 123456");

        System.out.println("-----");

        // Email + SMS + Slack
        Notifier multiNotifier = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));
        multiNotifier.send("Server down! Immediate action required.");
    }
}
