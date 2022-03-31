import java.util.Scanner;

public class ArraySmallestElementWithoutSorting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("The smallest element in the array is ");
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i]=temp;
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }
        System.out.println(a[0]);
    }
}
