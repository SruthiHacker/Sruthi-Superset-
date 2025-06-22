public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Shoes", "Fashion"),
            new Product("P003", "Mobile", "Electronics"),
            new Product("P004", "Book", "Education")
        };

        String searchItem = "Mobile";

        System.out.println("🔍 Linear Search:");
        Product foundLinear = SearchUtil.linearSearch(products, searchItem);
        System.out.println(foundLinear != null ? "✅ Found: " + foundLinear : "❌ Not Found");

        System.out.println("\n🔍 Binary Search:");
        Product foundBinary = SearchUtil.binarySearch(products, searchItem);
        System.out.println(foundBinary != null ? "✅ Found: " + foundBinary : "❌ Not Found");
    }
}
