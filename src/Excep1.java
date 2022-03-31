import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep1 {
    public static void main(String[] args) {
        try{
        System.out.println("Connection established");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value 1");
        int a=scanner.nextInt();
        System.out.println("Enter the second value");
        int b=scanner.nextInt();
        int c=a/b;
        System.out.println("Connection Terminated");}
        catch (InputMismatchException e){
            System.out.println("Input mismatch exception handled");
        }
    }
}
