public class Main {
    public static void main(String[] args) {
        
        Computer basicPC = new Computer.Builder("Intel i5", "8GB").build();
        basicPC.showConfig();

        System.out.println("-----");

        
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                                .setStorage("1TB SSD")
                                .setGPU("NVIDIA RTX 4080")
                                .setOS("Windows 11 Pro")
                                .build();
        gamingPC.showConfig();
    }
}
