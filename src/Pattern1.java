import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {

            for (int s = 0; s < (rows - i); s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
