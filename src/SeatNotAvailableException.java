import java.util.Scanner;

public class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String s){
        super(s);
    }
    public static void main(String[] args) throws SeatNotAvailableException {


            System.out.println("Enter the number of rows and columns");
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            int a[][]=new int[n][n];
            //int b[]=new int[((n*n)-1)];
            int seat=1;
            System.out.println("Enter the number of seats to be booked ");
            int seats=scanner.nextInt();
        try {
            System.out.println("Enter the seat numbers between 0 to "+((n*n)-1));
            for(int i=0;i<seats;i++){
                System.out.println("Enter your seat number "+(i+1));
                int pos=scanner.nextInt();

                if (a[pos/n][pos%n]==0) {
                    a[pos/n][pos%n]=seat;
                } else {
                    throw new SeatNotAvailableException("SeatNotAvailableException: Already Booked");
                }

            }

        } catch (SeatNotAvailableException e) {

            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception : You must choose seat between 0 to "+((n*n)-1));

        }
        System.out.println("The seat booked are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }



    }

