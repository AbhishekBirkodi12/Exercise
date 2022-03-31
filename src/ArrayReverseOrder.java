import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        System.out.println("Enter the Array size");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the Array Element");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
