import java.util.Scanner;

public class StringFirstHalf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String a=scanner.next();
        int l=a.length();

        for (int i = 0; i < l/2; i++) {
            System.out.print(a.charAt(i));
        }
    }
}
