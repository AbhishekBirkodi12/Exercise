import java.util.Scanner;

public class ArrayKeyElementIndexPrint {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Enter the Key");
        int key=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();

        }
        System.out.println("Array element at the Keys position"+key+" is ");

        System.out.println(a[key]);

    }
}
