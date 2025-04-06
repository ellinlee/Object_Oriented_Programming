package lab8;

class SMARTPHONE {
    double price;

    class OS{
        String name;
        double getVersion() {
            return 2.0;
        }
    }

    protected class Memory{
        String type;
        int getMemorySize() {
            return 64;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        SMARTPHONE sp = new SMARTPHONE();

        SMARTPHONE.OS os = sp.new OS();

        SMARTPHONE.Memory m = sp.new Memory();

        System.out.println("OS version is " + os.getVersion());
        System.out.println("Memory size (in GB) is " + m.getMemorySize());
    }
}
