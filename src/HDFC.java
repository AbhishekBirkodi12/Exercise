import java.util.Scanner;

public class HDFC {
    String name;
    String crn;
    String email;
    String pan;
    String balance;

    void getCustomerDetails(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        name=scanner.nextLine();
        System.out.println("Enter the crn number");
        crn=scanner.nextLine();
        System.out.println("Enter the email id");
        email=scanner.nextLine();
        System.out.println("Enter PAN number");
        pan=scanner.nextLine();
        System.out.println("Enter the balance");
        balance=scanner.nextLine();
        System.out.println("Thank you for the details. Please follow the same process for the rest of the customers if any ");


    }
    void printCustomerDetails(){
        System.out.println(" Name : "+name+"\n crn : "+crn+"\n Email id : "+email+"\n Pan Number : "+pan+"\n Balance :"+balance);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the customer");
        int n=scanner.nextInt();
        HDFC[] hdfc=new HDFC[n];
        for(int i=0;i<n;i++){
            hdfc[i]=new HDFC();
        }
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of No "+(i+1)+" customers");
            hdfc[i].getCustomerDetails();
        }

        for(int i=0;i<n;i++){
            System.out.println("Details of the customer "+(i+1)+ " are ");
            hdfc[i].printCustomerDetails();
        }
    }
}
