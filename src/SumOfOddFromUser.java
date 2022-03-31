import java.util.Scanner;

public class SumOfOddFromUser {
    public static void main(String[] args) {
        System.out.println("Please Enter two numbers");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        System.out.println("Sum of the Odd number in between these two number is ");
        int sum=0;
        for(int i=n1;i<=n2;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
