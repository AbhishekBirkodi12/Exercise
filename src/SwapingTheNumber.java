import java.util.Scanner;

public class SwapingTheNumber {
    public static void main(String[] args) {
        int temp=0;
        System.out.println("Enter the value of a");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b=scanner.nextInt();
        System.out.println("Before swapping , value of a is "+a+" and value of b is "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping, value of a is "+a+" and value of b is  "+b);


    }
}
