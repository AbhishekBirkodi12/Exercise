package ArrayCaseStudies;

import java.util.Scanner;

public class AdjacentSticks {
    public static void main(String[] args) {
        System.out.println("Enter the number of stick!! Make sure that its in even number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the lengths of the stick ");
        int a[] = new int[n];
        int b[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Entered lengths of the adjacent pairs of stick are ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (a[i] < a[i + 1]) {
                    b[i] = a[i];
                } else {
                    b[i] = a[i + 1];
                }
            }
        }

        for (int i = 0; i < n; i++) {


            sum = sum + b[i];
        }
        System.out.println(sum);
    }
}
