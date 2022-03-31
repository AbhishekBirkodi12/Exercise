import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Entered Character is a vowel");
                break;
            case 'e':
                System.out.println("Entered character is a vowel");
                break;
            case 'i':
                System.out.println("Entered character is a vowel");
                break;
            case 'o':
                 System.out.println("Entered character is a vowel");
                 break;
            case 'u':
                System.out.println("Entered character is a vowel");
                break;
            default:
                System.out.println("Entered character is not a vowel");
      }
    }
}





