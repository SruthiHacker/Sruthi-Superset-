public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        
        inventory.addProduct(new Product("P001", "Keyboard", 50, 799.99));
        inventory.addProduct(new Product("P002", "Mouse", 70, 499.50));

        
        inventory.showInventory();

        
        inventory.updateProduct("P002", 65, 459.50);

        
        inventory.deleteProduct("P001");

        
        inventory.showInventory();
    }
}
