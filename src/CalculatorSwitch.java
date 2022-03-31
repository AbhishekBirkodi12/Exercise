import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Operation that you want to perform");
        char ch=scanner.next().charAt(0);
        System.out.println("Enter A and B");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        switch (ch){
            case '+':
                System.out.println("Sum of the two numbers is "+(a+b));
                break;
            case '-':
                System.out.println("Difference of the two numbers is "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of the two numbers is "+(a*b));
                break;
            case '/':
                    if((a==0)||(b==0)){
                        System.out.println("Divide by zero Error");
                    }else{
                        System.out.println("Division of the two numbers are :"+(a/b));
                        break;
                    }
            default:
                System.out.println("Invalid operation requested");
                break;

        }
    }
}
