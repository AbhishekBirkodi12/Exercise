import java.util.Scanner;

public class StringReplaceUpperCaseVowelWithABC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String a=scanner.next();
        System.out.println("Before removing vowels "+a);
        String b=a.replaceAll("[AEIOU]","ABC");
        System.out.println("After removing vowels "+b);
    }

}
