import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("Entered number is an even number ");

        }else{
            System.out.println("Entered number is an odd number");
        }
    }
}
