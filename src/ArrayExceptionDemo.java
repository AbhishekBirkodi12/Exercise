import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            a[i]=scanner.nextInt();
        }
        for(int i:a){
            System.out.println(a[i]);
        }
    }
}
