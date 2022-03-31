
import java.util.Scanner;

public class ArrayEvenReverseOrder {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Enter the Array elements");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=a.length-2;i>=0;i=i-2){
            System.out.println(a[i]);
        }

    }
}
