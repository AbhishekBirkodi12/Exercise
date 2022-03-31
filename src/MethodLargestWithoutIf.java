import java.util.Scanner;

public class MethodLargestWithoutIf {
    void compareThreeValues(int x,int y,int z){
        System.out.println((x>y)&&(x>z)?"A is greater":(y>z)&&(y>x)?"B is greater":(z>x)&&(z>y)?"C is greater":null);
    }

    public static void main(String[] args) {
        MethodLargestWithoutIf methodLargestWithoutIf=new MethodLargestWithoutIf();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b=scanner.nextInt();
        System.out.println("Enter the value of c");
        int c=scanner.nextInt();
        methodLargestWithoutIf.compareThreeValues(a,b,c);
    }
}
