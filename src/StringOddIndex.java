import java.util.Scanner;

public class    StringOddIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String a=scanner.next();
        int l=a.length();

        for (int i = 1; i < l; i = i + 2) {
            System.out.print(a.charAt(i));
        }
    }
}
