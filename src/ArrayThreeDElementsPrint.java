import java.util.Scanner;

public class ArrayThreeDElementsPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m,n,o;
        System.out.println("Enter the rows and columns of the Matrix");
        m=scanner.nextInt();
        n=scanner.nextInt();
        o=scanner.nextInt();
        int a[][][]=new int[m][n][o];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<o;k++) {
                    a[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println("Array Elements are ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<o;k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}
