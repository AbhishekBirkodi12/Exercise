import java.util.Scanner;

public class ArrayProductOfOddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Array size");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Product of the even numbers in Array is:");
        int product=1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                product=product*a[i];
            }
        }
        System.out.println(product);
    }
}
