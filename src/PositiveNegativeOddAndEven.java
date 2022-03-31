import java.util.Scanner;

public class PositiveNegativeOddAndEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num != 0) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Entered number is positive and Even");

                } else {
                    System.out.println("Entered number is positive and odd");
                }
            } else {
                if (num % 2 == 0) {
                    System.out.println("Entered number is negative and even");
                } else {
                    System.out.println("Entered number is negative and odd");
                }
            }
        } else {
            System.out.println("Entered number is zero");
        }
    }
}
