import java.sql.Struct;
import java.util.Scanner;

public class StringRemoveNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println("After the deletion of numbers the string is ");
        String s1=s.replaceAll("[0123456789]","");
        System.out.println(s1);

    }
}
