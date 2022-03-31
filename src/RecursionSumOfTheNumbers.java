import java.util.Scanner;

public class RecursionSumOfTheNumbers {
    int add(int n){
        if(n==0){
            return 0;
        }
        return n+add(n-1);
    }
}
class RecurSumLaunch{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        RecursionSumOfTheNumbers recursionSumOfTheNumbers=new RecursionSumOfTheNumbers();
        System.out.println(recursionSumOfTheNumbers.add(n));
    }
}
