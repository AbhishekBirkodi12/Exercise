import java.util.Scanner;

public class RecursionFactorial {
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
class FactLaunch{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        RecursionFactorial recursionFactorial=new RecursionFactorial();

        System.out.println(recursionFactorial.fact(n));
    }
}
