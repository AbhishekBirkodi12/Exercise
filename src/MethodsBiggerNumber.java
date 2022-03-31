import java.util.Scanner;

public class MethodsBiggerNumber {

    void compareTwoNumbers(int a,int b){
        if(a>b){
            System.out.println("A is greater");

        }else{
            System.out.println("B is greater");
        }



    }

    public static void main(String[] args) {
        MethodsBiggerNumber methodsBiggerNumber=new MethodsBiggerNumber();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();

        methodsBiggerNumber.compareTwoNumbers(a,b);
    }
}
