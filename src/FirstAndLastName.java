import java.util.Scanner;

public class FirstAndLastName {
    public static void main(String[] args) {
        System.out.println("Please enter your firstName :");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last lastName");
        String lastName = scanner.nextLine();
        System.out.println("Your full name is " + firstName + " " + lastName);
    }
}
