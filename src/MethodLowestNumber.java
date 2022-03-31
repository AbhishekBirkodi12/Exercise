import java.util.Scanner;

public class MethodLowestNumber {
    void lowestNumber(int x,int y){
        if(x<y){
            System.out.println("X is the smaller number ");
        }else{
            System.out.println("Y is the smaller number ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of x ");
        int x=scanner.nextInt();
        System.out.println("Enter the value of y");
        int y=scanner.nextInt();

    }
}
