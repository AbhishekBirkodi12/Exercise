import java.util.Scanner;

public class GreaterThanOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two variables");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a>b);
    }
}
