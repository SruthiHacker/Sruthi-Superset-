public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("nature.jpg");
        Image img2 = new ProxyImage("city.jpg");

        
        System.out.println("Accessing nature.jpg first time:");
        img1.display(); 

        System.out.println("Accessing nature.jpg second time:");
        img1.display(); 

        System.out.println("Accessing city.jpg:");
        img2.display(); 
    }
}
