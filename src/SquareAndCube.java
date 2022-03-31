import java.util.Scanner;

public class SquareAndCube {

    public static void main(String[] args) {
        System.out.println("Please enter a number for which you want to find out the square and cube:");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double square = num * num;
        System.out.println("Square of the entered number " + num + " is " + square);
        double cube = num * num * num;
        System.out.println("Cube of the entered number " + num + " is" + cube);
    }
}
