import java.util.Scanner;

public class ArrayOddReverse {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the Array elements");
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = a.length - 1; i >= 1; i = i - 2) {
            System.out.println(a[i]);
        }
    }
}
