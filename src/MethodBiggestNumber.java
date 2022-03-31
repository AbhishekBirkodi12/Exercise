import java.util.Scanner;

public class MethodBiggestNumber {
    void compareThreeNum(int a,int b,int c){
        if((a>b)&&(a>c)){
            System.out.println("A is the largest");
        }else if((b>a)&&(b>c)){
            System.out.println("B is the largest");
        }else{
            System.out.println("C is the largest");
        }

    }

    public static void main(String[] args) {
        MethodBiggestNumber methodBiggestNumber=new MethodBiggestNumber();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number " );
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        System.out.println("Enter the Third number ");
        int c=scanner.nextInt();
        methodBiggestNumber.compareThreeNum(a,b,c);
    }
}
