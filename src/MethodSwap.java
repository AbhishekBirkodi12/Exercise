import java.util.Scanner;

public class MethodSwap {
    void swap(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping  value of a is : "+a+" Value of b is : "+b);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b :");
        int b=scanner.nextInt();
        System.out.println("Before swapping the value of a is : "+a+" value of b is : "+b);
        MethodSwap methodSwap=new MethodSwap();
        methodSwap.swap(a,b);
    }
}
