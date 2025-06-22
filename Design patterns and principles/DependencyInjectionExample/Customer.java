public class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Customer ID: " + id + ", Name: " + name);
    }
}
