import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Connection  established");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b=scanner.nextInt();
        try{
            int c=a/b;
        }catch (ArithmeticException e){
            System.out.println("Handled!");
        }
        System.out.println("Connection terminated");

    }
}
