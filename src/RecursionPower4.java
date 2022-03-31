import java.util.Scanner;

public class RecursionPower4 {
    public static int powerOf(int base,int power){
        if(power==0){
            return 1;
        }
        return base*powerOf(base,power-1);
    }


    public static void main(String[] args) {
        System.out.println("Enter the base");
        Scanner scanner=new Scanner(System.in);
        int base=scanner.nextInt();
        System.out.println("Enter the power");
        int power=scanner.nextInt();
        System.out.println(powerOf(base,power));

    }
}
