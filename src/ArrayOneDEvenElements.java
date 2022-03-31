import java.util.Scanner;

public class ArrayOneDEvenElements {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Odd index Elements of the entered Array are :");
        for(int i=0;i<a.length;i=i+2){
            System.out.println(a[i]);
        }
    }
}
