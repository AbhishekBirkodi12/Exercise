import java.util.Scanner;

public class StringOddIndexReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String a=scanner.next();
        int l=a.length();
        for (int i =  l-2; i >=0; i=i-2) {
            System.out.print(a.charAt(i)+" ");
        }
    }

}
