import java.util.Scanner;

public class Exception_HandlingExersise1 {
    public static void main(String[] args) {

        try {


        System.out.println("Enter the total cost");
        Scanner scanner=new Scanner(System.in);
        int cost=scanner.nextInt();
        System.out.println("Enter the number of days");
        int n=scanner.nextInt();
        int perDayCost=cost/n;
            System.out.println("Cost per day is "+perDayCost);
        }catch (ArithmeticException e){
            System.out.println("Days cannot be zero.Check your input again");
        }

    }
}
