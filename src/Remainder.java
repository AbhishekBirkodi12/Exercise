import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int remainder=n1%n2;
        System.out.println("Remainder is : "+remainder);


    }
}
