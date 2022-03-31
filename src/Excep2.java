import java.util.Scanner;

public class Excep2 {
    public static void main(String[] args) {
        try {
            System.out.println("Connection established");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a=scanner.nextInt();
            System.out.println("Enter the value of b");
            int b=scanner.nextInt();
            int c=a/b;


            System.out.println("Enter the size of the array");
            int size=scanner.nextInt();
            System.out.println("Enter the element of the array that you want to insert");
            int element=scanner.nextInt();
            System.out.println("Enter the position at which you want to insert the array");
            int pos=scanner.nextInt();
            int d[]=new int[size];
            d[pos]=element;
            System.out.println(d[pos]);

        }catch (Exception e){
            System.out.println("General Exception handled");
        }
        System.out.println("Connection terminated");

    }
}
