import java.util.Scanner;

public class StringFirstHalfReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String a=scanner.next();
        int l=a.length();
        for (int  i = (l/2)-1;i>=0 ; i--) {
            System.out.print(a.charAt(i));
        }
    }

}
