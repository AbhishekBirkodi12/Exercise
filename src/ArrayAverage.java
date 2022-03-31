import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        System.out.println("Enter the Array size");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Average of the Entered Array elements is ");
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println((float) sum/n);
    }
}
