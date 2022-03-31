import java.util.Scanner;

public class RecursionFibonachi {
    public static int fibonachiRec(int n){
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        return fibonachiRec(n-2)+fibonachiRec(n-1);

    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fibonachiRec(i)+" ");
        }
    }
}
