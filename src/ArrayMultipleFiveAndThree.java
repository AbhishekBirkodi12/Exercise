import java.util.Scanner;

public class ArrayMultipleFiveAndThree {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i =0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Multiples of 5 or 3 are: ");
        for(int i=0;i<a.length;i++){
            if((a[i]%5==0)||(a[i]%3==0)){
                System.out.println(a[i]);
            }
        }
    }

}
