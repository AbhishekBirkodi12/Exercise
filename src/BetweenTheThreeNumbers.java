import java.util.Scanner;

public class BetweenTheThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of i");
        int i=scanner.nextInt();
        System.out.println("Enter the value of r");
        int r=scanner.nextInt();
        System.out.println("Enter the value of k");
        int k=scanner.nextInt();
        int count=0;
        for(int a=i;a<=r;a++){
            if(a%k==0){
                count++;
            }

        }
        System.out.println(count);




        

    }
}
