import java.util.Scanner;

public class ArrayTwoDimensionalProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=scanner.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("Enter the Array elements of the first Array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scanner.nextInt();

            }
        }
        System.out.println("Enter the Array elements of the Second Array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=scanner.nextInt();

            }
        }
        int c[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}








