import java.util.Scanner;

public class ArrayTwoDElementsPrint {
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
        System.out.println("Array Elements are ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");

            }
        }

    }
}
