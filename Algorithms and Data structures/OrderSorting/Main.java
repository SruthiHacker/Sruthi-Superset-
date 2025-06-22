public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Alice", 2999.50),
            new Order("O102", "Bob", 1999.00),
            new Order("O103", "Charlie", 4999.99),
            new Order("O104", "Diana", 999.75)
        };

        System.out.println("📦 Original Orders:");
        SortUtil.displayOrders(orders);

        
        System.out.println("\n🧼 Sorted by Bubble Sort:");
        SortUtil.bubbleSort(orders);
        SortUtil.displayOrders(orders);

        
        orders = new Order[] {
            new Order("O101", "Alice", 2999.50),
            new Order("O102", "Bob", 1999.00),
            new Order("O103", "Charlie", 4999.99),
            new Order("O104", "Diana", 999.75)
        };

        
        System.out.println("\n⚡ Sorted by Quick Sort:");
        SortUtil.quickSort(orders, 0, orders.length - 1);
        SortUtil.displayOrders(orders);
    }
}
