import java.util.Scanner;

public class ArraySumOfTwoDimesionalElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the rows and columns of the Matrix");
        m=scanner.nextInt();
        n=scanner.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scanner.nextInt();

            }
        }
        int sum=0;
        System.out.println("Sum of Array Elements are ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=a[i][j];

            }
        }
        System.out.println(sum);

    }

}
