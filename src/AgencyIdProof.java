import java.util.Scanner;

public class AgencyIdProof {
    public static void main(String[] args) {
        String name;
        String phoneNumber;
        String address;
        String email;
        String accountNumber;
        String fatherIdNumber;
        String panNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What  would you like to Apply for?");
        System.out.println("Press 1 for Aadhar card ");
        System.out.println("Press 2 for PAN card ");
        System.out.println("Press 3 for VoterID card ");
        System.out.println("Press 4 for Passport ");
        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1:

                System.out.println("Enter your Name");
                name =scanner.next();
                System.out.println("Enter your phone number");
                phoneNumber = scanner.next();
                System.out.println("Enter your Address");
                address = scanner.next();
                System.out.println("Enter your Email id");
                email = scanner.next();
                System.out.println("You have entered your details as follows and confirm the same ");
                System.out.println("name : " + name);
                System.out.println("Phone Number : " + phoneNumber);
                System.out.println("Address : " + address);
                System.out.println("Email id : " + email);
                break;


            case 2:
                System.out.println("Enter your Name");
                name = scanner.next();
                System.out.println("Enter your phone number");
                phoneNumber = scanner.next();
                System.out.println("Enter your Address");
                address = scanner.next();
                System.out.println("Enter your Email id");
                email = scanner.next();
                System.out.println("Enter your account number");
                accountNumber = scanner.next();
                System.out.println("You have entered your details as follows and confirm the same ");
                System.out.println("name : " + name);
                System.out.println("Phone Number : " + phoneNumber);
                System.out.println("Address : " + address);
                System.out.println("Email id : " + email);
                System.out.println("Account Number : " + accountNumber);
                break;

            case 3:
                System.out.println("Enter your Name");
                name = scanner.next();
                System.out.println("Enter your phone number");
                phoneNumber = scanner.next();
                System.out.println("Enter your Address");
                address = scanner.next();
                System.out.println("Enter your Email id");
                email = scanner.next();
                System.out.println("Enter your account number");
                accountNumber = scanner.next();
                System.out.println("Enter your FatherId Number");
                fatherIdNumber = scanner.next();
                System.out.println("You have entered your details as follows. Please confirm the same ");
                System.out.println("name : " + name);
                System.out.println("Phone Number : " + phoneNumber);
                System.out.println("Address : " + address);
                System.out.println("Email id : " + email);
                System.out.println("Account Number : " + accountNumber);
                System.out.println("FatherId Number : " + fatherIdNumber);
                break;

            case 4:
                System.out.println("Enter your Name");
                name=scanner.next();
                System.out.println("Enter your phone number");
                phoneNumber = scanner.next();
                System.out.println("Enter your Address");
                address = scanner.next();
                System.out.println("Enter your Email id");
                email = scanner.next();
                System.out.println("Enter your account number");
                accountNumber = scanner.next();
                System.out.println("Enter your FatherId Number");
                fatherIdNumber = scanner.next();
                System.out.println("Enter your PAN number ");
                panNumber = scanner.next();
                System.out.println("You have entered your details as follows and confirm the same ");
                System.out.println("name : " + name);
                System.out.println("Phone Number : " + phoneNumber);
                System.out.println("Address : " + address);
                System.out.println("Email id : " + email);
                System.out.println("Account Number : " + accountNumber);
                System.out.println("FatherId Number : " + fatherIdNumber);
                System.out.println("PAN number : " + panNumber);
                break;

            default:
                System.out.println("Invalid choice");
                break;


        }


    }
}
