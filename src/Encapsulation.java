import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Enter the name,crn,balance");
        CustomerEncaps customerEncaps=new CustomerEncaps();
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int crn=scanner.nextInt();
        int balance=scanner.nextInt();
        customerEncaps.setName(name);
        customerEncaps.setCrn(crn);
        customerEncaps.setBalance(balance);
        System.out.println(customerEncaps.getName());
        System.out.println(customerEncaps.getCrn());
        System.out.println(customerEncaps.getBalance());
    }
}
