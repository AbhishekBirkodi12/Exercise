import java.util.Scanner;

public class CalculatorMethods {
    void add(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }
    void subtract(int a ,int b){
        System.out.println("Subtraction is : "+ (a-b));

    }
    void multiplication(int a , int b){
        System.out.println("Multiplication is : "+(a*b));
    }
    void division(int a ,int b){
        System.out.println("Division is : "+(a/b));

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CalculatorMethods calculatorMethods=new CalculatorMethods();
        System.out.println("Enter value of A ");
        int a=scanner.nextInt();
        System.out.println("Enter value of B ");
        int b=scanner.nextInt();

        calculatorMethods.add(a,b);
        calculatorMethods.subtract(a,b);
        calculatorMethods.multiplication(a,b);
        calculatorMethods.division(a,b);
    }
}
