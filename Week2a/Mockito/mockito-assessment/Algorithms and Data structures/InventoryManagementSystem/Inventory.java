import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("✅ Product added: " + product.getProductName());
    }

    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("🔁 Product updated: " + product.getProductName());
        } else {
            System.out.println("❌ Product not found for ID: " + productId);
        }
    }

    public void deleteProduct(String productId) {
        if (products.remove(productId) != null) {
            System.out.println("🗑️ Product removed: " + productId);
        } else {
            System.out.println("❌ Product not found for deletion: " + productId);
        }
    }

    public void showInventory() {
        System.out.println("\n📦 Inventory List:");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
