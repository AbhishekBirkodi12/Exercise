import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        System.out.println("Enter the letter");
        Scanner scanner = new Scanner(System.in);
        char alpha = scanner.next().charAt(0);
        System.out.println("You have entered " + alpha);
        if ((alpha == 'a') || (alpha == 'e') || (alpha == 'i') || (alpha == 'o') || (alpha == 'u')) {
            System.out.println("Entered letter " + alpha + " is a vowel");

        } else {
            System.out.println("Entered letter is a consonant");
        }
    }
}
