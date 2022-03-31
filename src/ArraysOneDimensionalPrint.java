import java.util.Scanner;

public class ArraysOneDimensionalPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Entered Array elements are : ");
        for(int i=0;i<a.length;i++){
            System.out.println(+a[i]);
        }
    }
}
