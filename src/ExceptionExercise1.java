import java.util.Scanner;

public class ExceptionExercise1 {
    public static void main(String[] args) {




       try {
           System.out.println("Connection established");
           System.out.println("Enter the size of the array");
           Scanner scanner=new Scanner(System.in);
           int size=scanner.nextInt();
           int a[]=new int[size];
           System.out.println("Enter the array elements");
           for(int i=0;i<a.length;i++){
               a[i]=scanner.nextInt();
           }
           for(int i=0;i<a.length;i++){
               System.out.println(a[i]);
           }
        System.out.println("Enter the position that you want to display");
        int pos=scanner.nextInt();
        System.out.println(a[pos]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayOutOfBoundException has been handled");
       }
        System.out.println("Connection terminated");
    }
}
