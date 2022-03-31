import java.util.Scanner;

public class ExceptionFinally1 {
    public static void main(String[] args) {
        try{
            System.out.println("Enter the value of a");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            System.out.println("Enter the value of b");
            int b=scanner.nextInt();
            try{
                int c=a/b;
            }finally {
                System.out.println("Inside finally block executed");
            }


        }finally {
            System.out.println("Outside finally block executed");
        }
    }
}
