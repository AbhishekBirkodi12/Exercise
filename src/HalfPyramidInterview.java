import java.util.Scanner;

public class HalfPyramidInterview {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=1;i<=size;i++){
            for(int s=0;s<size-i;s++){
                System.out.print("  ");
            }
            for(int j=0;(j<i*2-1);j++){
                System.out.print("1");
            }

            System.out.println();
        }

    }
}
