import java.util.Scanner;

public interface Notification {

    String notificationBySms();

    String notificationByEmail();

    String notificationByCourier();
}

class Icici implements Notification {


    public String notificationBySms() {
        return "ICICI - Notification By SMS";
    }


    public String notificationByEmail() {
        return "ICICI - Notification By Email";
    }


    public String notificationByCourier() {
        return "ICICI - Notification By courier";
    }
}

class Hdfc implements Notification {


    public String notificationBySms() {
        return "HDFC - Notification By SMS";
    }


    public String notificationByEmail() {
        return "HDFC - Notification By Email";
    }


    public String notificationByCourier() {
        return "HDFC - Notification By courier";
    }
}

class BankFactory {
    public Icici getIcici() {
        Icici icici = new Icici();
        return icici;
    }

    public Hdfc getHdfc() {
        Hdfc hdfc = new Hdfc();
        return hdfc;
    }
}

class DriverInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your bank\n1.ICICI\n2.HDFC");

        int choice = scanner.nextInt();
        System.out.println("Enter the type of notification you would like to receive\n1.SMS\n2.Mail\n3.Courier");
        int choice1 = scanner.nextInt();
        switch (choice) {
            case 1:
                Icici icici = new Icici();
                switch (choice1) {
                    case 1:
                        System.out.println(icici.notificationBySms());
                        break;
                    case 2:
                        System.out.println(icici.notificationByEmail());
                        break;
                    case 3:
                        System.out.println(icici.notificationByCourier());
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            case 2:
                Hdfc hdfc = new Hdfc();
                switch (choice1) {
                    case 1:
                        System.out.println(hdfc.notificationBySms());
                        break;
                    case 2:
                        System.out.println(hdfc.notificationByEmail());
                    case 3:
                        System.out.println(hdfc.notificationByCourier());
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input. Check your input");

        }


    }
}