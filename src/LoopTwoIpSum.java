import java.util.Scanner;

public class LoopTwoIpSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Initial value");
        int a=scanner.nextInt();
        System.out.println("Enter the final value");
        int b=scanner.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
         sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
}
