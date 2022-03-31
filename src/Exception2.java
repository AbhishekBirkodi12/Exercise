import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        try{
            System.out.println("Enter the value of a");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            System.out.println("Enter the value of b");
            int b=scanner.nextInt();
            try{
                int c=a/b;
            }catch (ArithmeticException e){
                System.out.println("AE exception");
            }


        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("Connection terminated");
    }

}
