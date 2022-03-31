import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("Enter the values of  a");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.println("You have entered " + a);
        System.out.println("Enter the values of  b");
        b = scanner.nextDouble();
        System.out.println("You have entered " + b);
        //Performing addition
        c = a + b;
        System.out.println("Addition of the two entered numbers is:" + c);
        //Performing Subtraction
        c = a - b;
        System.out.println("Subtraction of the two entered numbers is:" + c);
        //Performing multiplication
        c = a * b;
        System.out.println("Multiplication of the two entered numbers is:" + c);
        //Performing division
        if (a == 0 || b == 0) {
            System.out.println("Divide by zero Error");
        } else {
            c = a / b;
            System.out.println("Division of the two entered numbers is:" + c);
        }


    }
}
