import java.util.Scanner;

public class Exception_Handling_ArraySeatBooking {
    public static void main(String[] args) {
        System.out.println("Connection established");


        try {
            System.out.println("Enter the number of seats to be booked ");
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            int a[]=new int[n];
            int size1=100;
            int seat=1;
            int b[]=new int[size1];
            for(int i=0;i<a.length;i++){
                System.out.println("Enter the seat number"+(i+1));
                int pos= scanner.nextInt();
                a[i]=pos;
               b[pos]=seat;
            }
            System.out.println("Seats booked are ");
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }

        } catch (Exception e) {
            System.out.println("Enter the seat number in the range 1-100");
        }
        System.out.println("Connection terminated");
    }
}

