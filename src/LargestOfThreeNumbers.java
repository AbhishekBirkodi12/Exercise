import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the three number");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("A is the greatest");
        }else if((b>a)&&(b>c)){
            System.out.println("B is the greatest");
        }else{
            System.out.println("C is the greatest");
        }
    }
}
