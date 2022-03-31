import java.util.Scanner;

public class ArraySumOfAllOddElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Sum of Odd index Elements of the entered Array is :");
        int sum=0;
        for(int i=1;i<a.length;i=i+2){
           sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
