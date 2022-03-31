import java.util.Scanner;

public class MethodSmallestNumber {
    void compareThreeNum(int a,int b,int c){
        if((a<b)&&(a<c)){
            System.out.println("A is the smallest");
        }else if((b<a)&&(b<c)){
            System.out.println("B is the smallest");
        }else{
            System.out.println("C is the smallest");
        }

    }

    public static void main(String[] args) {
        MethodSmallestNumber methodSmallestNumber=new MethodSmallestNumber();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number " );
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        System.out.println("Enter the Third number ");
        int c=scanner.nextInt();
        methodSmallestNumber.compareThreeNum(a,b,c);
    }
}
