import java.util.Scanner;

public class MethodThreeNoLowestWithTernary {
    void LowestWithTernary(int a, int b, int c) {
        System.out.println((a < b) && (a < c) ? "A is the smallest " : (b < c) && (b < a) ? "B is the smallest" : "C is the smallest");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b");
        int b = scanner.nextInt();
        System.out.println("Enter the value of c");
        int c = scanner.nextInt();
        MethodThreeNoLowestWithTernary methodThreeNoLowestWithTernary = new MethodThreeNoLowestWithTernary();
        methodThreeNoLowestWithTernary.LowestWithTernary(a, b, c);
        
    }
}
