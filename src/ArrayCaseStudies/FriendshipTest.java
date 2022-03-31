package ArrayCaseStudies;

import java.util.Arrays;
import java.util.Scanner;

public class FriendshipTest {
    public static void main(String[] args) {
        System.out.println("Enter the number of friends");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        int count=0;
        int duplicate=0;
        int noduplicate = 0;

        System.out.println("Enter friends respective days");
        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for(int i=0;i<n-1;i++){

            if(a[i]==a[i+1]){
                duplicate++;
            }else {
                noduplicate++;
            }
        }
        System.out.println("Saved friendship "+(1+noduplicate));
    }
}
