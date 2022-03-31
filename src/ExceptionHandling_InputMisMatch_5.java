import java.util.Scanner;

public class ExceptionHandling_InputMisMatch_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter an integer value");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Pass integer value only");
        }
    }
}
