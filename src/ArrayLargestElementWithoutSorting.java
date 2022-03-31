import java.util.Scanner;

public class ArrayLargestElementWithoutSorting {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("The Largest element in the Array is:");
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    a[i]=temp;
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[0]);

    }
}
