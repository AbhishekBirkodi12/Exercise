import java.util.Scanner;

public class ArraySimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the 1-D array");
        int x = scanner.nextInt();
        int a[] = new int[x];

        System.out.println("Enter the One Dimensional Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Entered One dimensional Array is : ");
        for (int i : a) {
            //System.out.println(a[i - 1]);
            System.out.println(a[i-1]);
        }


        System.out.println("Enter the size of the  2-D array");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Enter a two dimensional array ");
        int c[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = scanner.nextInt();

            }

        }
        System.out.println("Entered two dimensional array is ");
       for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter a jagged array ");
        int d[][] = new int[2][];
        d[0] = new int[2];
        d[1] = new int[3];

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entered Jagged Array is ");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}


