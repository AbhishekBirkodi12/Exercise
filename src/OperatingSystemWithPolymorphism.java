import java.util.Scanner;

public class OperatingSystemWithPolymorphism {

    void writeCode() {
        System.out.println("Writing code in OS");
    }

    void shutDown(int i) {
        System.out.println("Shutting down in OS");
    }
}

class Windows2 extends OperatingSystemWithPolymorphism {
    void writeCode() {
        System.out.println("Writing code in Windows");
    }

    void shutDown(int a) {
        System.out.println("Shutting down in Windows");
    }
}

class Unix1 extends OperatingSystemWithPolymorphism {
    void writeCode() {
        System.out.println("Writing code in unix");
    }

    void shutDown(int a) {
        System.out.println("Shutting down in unix");
    }
}

class Mac1 extends OperatingSystemWithPolymorphism {
    void writeCode() {
        System.out.println("Writing code in Mac");
    }

    void shutDown(int a) {
        System.out.println("Shutting down in Mac");
    }
}

class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1.Windows 2.Unix 3.Mac");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
               OperatingSystemWithPolymorphism operatingSystemWithPolymorphism = new Windows2();
               operatingSystemWithPolymorphism.writeCode();
               operatingSystemWithPolymorphism.shutDown(10);
               break;


            case 2:
                   OperatingSystemWithPolymorphism operatingSystemWithPolymorphism1= new Unix1();
                   operatingSystemWithPolymorphism1.writeCode();
                   operatingSystemWithPolymorphism1.shutDown(10);
                   break;




            case 3:
                OperatingSystemWithPolymorphism operatingSystemWithPolymorphism2 = new Mac1();
                operatingSystemWithPolymorphism2.writeCode();
                operatingSystemWithPolymorphism2.shutDown(10);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
