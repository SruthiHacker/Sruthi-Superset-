public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser1 = new MobileApp("Alice");
        Observer webUser1 = new WebApp("Bob");

        stockMarket.registerObserver(mobileUser1);
        stockMarket.registerObserver(webUser1);

        System.out.println("Stock price update: 100.50");
        stockMarket.setStockPrice(100.50);

        System.out.println("\nStock price update: 110.75");
        stockMarket.setStockPrice(110.75);

        System.out.println("\nBob unsubscribes...");
        stockMarket.removeObserver(webUser1);

        System.out.println("\nStock price update: 120.30");
        stockMarket.setStockPrice(120.30);
    }
}
