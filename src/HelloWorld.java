import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner scan =new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("Number entered is "+a);

        for(int i=0;i<10;i++){
            System.out.println("Hello world");
        }



    }

}
