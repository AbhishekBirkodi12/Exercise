import java.util.Scanner;

public class MethodLesserWithTernary{
    void lowestOfTwoNumberWithoutIf(int a,int b){
        System.out.println((a<b)?"a is smaller":"b is smaller ");

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b=scanner.nextInt();
        MethodLesserWithTernary methodLesserWithTernary=new MethodLesserWithTernary();
        methodLesserWithTernary.lowestOfTwoNumberWithoutIf(a,b);

    }
}
