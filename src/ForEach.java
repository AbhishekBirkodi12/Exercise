import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array element");
        for(int i=0;i<5;i++){
            a[i]=scanner.nextInt();
        }
        for(int i:a){
            System.out.println(i);
        }
    }

}
