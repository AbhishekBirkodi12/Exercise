import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want to find");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++) {
        factorial=factorial*i;

        }
        System.out.println("Factorial is "+factorial);
    }
}
