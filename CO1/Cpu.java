public class Cpu {
    private double price;

    public Cpu(double price) {
        this.price = price;
    }

    public class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public int getCores() {
            return cores;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static class Ram {
        private int memory;
        private String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static void main(String[] args) {
        Cpu cpu = new Cpu(500);
        Cpu.Processor processor = cpu.new Processor(8, "Intel");
        Cpu.Ram ram = new Cpu.Ram(16, "Corsair");

        System.out.println("Processor Information:");
        System.out.println("No. of Cores: " + processor.getCores());
        System.out.println("Manufacturer: " + processor.getManufacturer());

        System.out.println("\nRAM Information:");
        System.out.println("Memory: " + ram.getMemory() + "GB");
        System.out.println("Manufacturer: " + ram.getManufacturer());
    }
}

/**
 Processor Information:
No. of Cores: 8
Manufacturer: Intel

RAM Information:
Memory: 16GB
Manufacturer: Corsair

 */