public class Computer {
    
    private String cpu;
    private String ram;

    
    private String storage;
    private String gpu;
    private String os;

    
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String os;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void showConfig() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + (storage != null ? storage : "N/A"));
        System.out.println("GPU: " + (gpu != null ? gpu : "N/A"));
        System.out.println("OS: " + (os != null ? os : "N/A"));
    }
}
