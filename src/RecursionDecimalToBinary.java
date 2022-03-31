import java.util.Scanner;

public class RecursionDecimalToBinary {
    String convertToBinary(int n,String t){
        if(n==0){
            return t;
        }
        int x=n%2;
        n=n/2;
        t=x+t;
        return convertToBinary(n, t);

    }
}
class DecimalLaunch{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        RecursionDecimalToBinary recursionDecimalToBinary=new RecursionDecimalToBinary();
        System.out.println(recursionDecimalToBinary.convertToBinary(n,""));
    }
}
