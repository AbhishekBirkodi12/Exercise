import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num>0){
            System.out.println("Entered number is a positive number");
        }else{
            System.out.println("Entered number is a negative number");
        }
    }
}
