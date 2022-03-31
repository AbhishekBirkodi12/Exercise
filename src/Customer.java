

import java.util.Scanner;

public class Customer {
    String name;
    String phone;
    String address;
    String gender;

    void getDetails(){
        System.out.println("Enter the name");
        Scanner scanner= new Scanner(System.in);
        name=scanner.nextLine();
        System.out.println("Enter the phone number");
        phone=scanner.nextLine();
        System.out.println("Enter the gender");
        gender=scanner.nextLine();
        System.out.println("Enter the address");
        address=scanner.nextLine();
    }
    void printDetails(){
        System.out.println(" Name : "+name +"\n Phone number: "+phone+"\n Address: "+address+"\n Gender : "+gender);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number of the customer ");
        int customerNumber=scanner.nextInt();
        Customer[] c=new Customer[customerNumber];
        for(int i=0;i<customerNumber;i++){
            System.out.println("Enter the details of No "+(i+1)+" customer");
            c[i]=new Customer();
        }
        for(int i=0;i<customerNumber;i++){
            c[i].getDetails();
        }
        System.out.println("Details of the customers");
        for(int i =0;i<customerNumber;i++){
            c[i].printDetails();
        }
    }
}
