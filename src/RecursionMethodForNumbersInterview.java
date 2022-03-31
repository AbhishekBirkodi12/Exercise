import java.util.Scanner;

public class RecursionMethodForNumbersInterview {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextInt();
        double result=sumOFNumbers(n);
        System.out.println("Sum of the given number "+n+ " is "+result);
    }

     static double
     sumOFNumbers(double n) {
        if(n==0){
            return 0;
        }
        return (n%10+sumOFNumbers(n/10));
    }
}
