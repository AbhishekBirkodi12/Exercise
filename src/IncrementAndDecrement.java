import java.util.Scanner;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        System.out.println("Enter the value of x");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
    }
}
