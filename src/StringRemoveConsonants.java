import java.util.Scanner;

public class StringRemoveConsonants {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println("Before removing the consonants");
        System.out.println(s);
        String s1=s.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]","");
        System.out.println("After removing the consonants");
        System.out.println(s1);

    }
}
