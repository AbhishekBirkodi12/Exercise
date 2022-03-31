package ArrayCaseStudies;

import java.util.Scanner;

public class WelcomeParty {
    public static void main(String[] args) {

        System.out.println("Enter the number of rooms");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int a[]=new int[n];
        int paint=0;
        int red=0;
        int green=0;
        int blue=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the color configuration for room number "+(i+1) +" !Choose 1-red,2-green,3-blue");
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){

            if(a[i]==1){
                red++;
            }
            else if(a[i]==2){
               green++;
            }
            else if (a[i]==3){
                blue++;
            }else {
                System.out.println("Invalid configuration");
            }
        }
       if(red>green&&red>blue){
          paint =n-red;
       }
       else if(green>red&&green>blue){
           paint=n-green;
       }
       else {
           paint=n-blue;
       }
        System.out.println("Number of rooms need to be painted are : \n"+paint);

    }
}
