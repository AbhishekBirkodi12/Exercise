import java.util.Scanner;

public class NegationOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two values");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        boolean res=a<b;

        System.out.println(!res);
    }
}
