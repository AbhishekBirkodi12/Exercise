import java.util.Scanner;

public class MethodGreaterWithoutIf {
    void compareTwoNumbers(int x,int y){
        System.out.println((x>y)?"A is greater":"B is greater");
    }

    public static void main(String[] args) {
        MethodGreaterWithoutIf methodGreaterWithoutIf=new MethodGreaterWithoutIf();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b=scanner.nextInt();
        methodGreaterWithoutIf.compareTwoNumbers(a,b);
    }
}
