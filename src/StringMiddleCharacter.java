import java.util.Scanner;

public class StringMiddleCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String a=scanner.next();
        int l=a.length();


        System.out.print(a.charAt((l/2)-1));
    }

}
