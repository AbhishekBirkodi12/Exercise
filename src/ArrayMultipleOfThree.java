import java.util.Scanner;

public class ArrayMultipleOfThree {
    public static void main(String[] args) {
        System.out.println("Enter the Array size");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Multiples of 3 in the given Array are : ");
        for(int i=0;i<a.length;i++){
            if(a[i]%3==0){
                System.out.println(a[i]);
            }
        }
    }
}
