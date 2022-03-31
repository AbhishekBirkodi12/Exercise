import java.util.Scanner;

public class OperatingSystem {
    void writeCode() {
        System.out.println("Writing code in OS");
    }

    void shutDown() {
        System.out.println("Shutting down in OS");
    }
}

class Windows1 extends OperatingSystem {
    void writeCode() {
        System.out.println("Writing code in Windows");
    }

    void shutDown(int a) {
        System.out.println("Shutting down in Windows");
    }
}

class Unix extends OperatingSystem {
    void writeCode() {
        System.out.println("Writing code in unix");
    }

    void shutDown(int a) {
        System.out.println("Shutting down in unix");
    }
}

class Mac extends OperatingSystem {
    void writeCode() {
        System.out.println("Writing code in Mac");
    }

    void shutDown(int a) {
        System.out.println("Shutting down in Mac");
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1.Windows 2.Unix 3.Mac");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Windows1 windows = new Windows1();
                windows.writeCode();
                windows.shutDown(5);
                break;
            case 2:
                Unix unix = new Unix();
                unix.writeCode();
                unix.shutDown(6);
                break;

            case 3:
                Mac mac = new Mac();
                mac.writeCode();
                mac.shutDown(7);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
