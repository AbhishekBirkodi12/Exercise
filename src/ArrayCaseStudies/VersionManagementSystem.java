package ArrayCaseStudies;

import java.util.Scanner;

public class VersionManagementSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the N");
        int n=scanner.nextInt();
        System.out.println("Enter the M");
        int m=scanner.nextInt();
        System.out.println("Enter the k");
        int k=scanner.nextInt();
        int source[]=new int[n];
        int ignored[]=new int[m];
        int tracked[]=new int[k];
        int tempignore=0;
        int tempTrack=0;
        int trackIgnoredCount=0;
        int untrackedUnIgnoredCount=0;
        int tiutui=0;

        for (int i = 0; i <n; i++) {
            source[i]=(i+1);
        }
        System.out.println("Enter the sequence of ignored file");
        for (int i = 0; i <m ; i++) {
            ignored[i]=scanner.nextInt();
        }
        System.out.println("Enter the sequence of tracked file");
        for (int i = 0; i <k ; i++) {
            tracked[i]=scanner.nextInt();
        }
        for (int i = 0; i <source.length ; i++) {
            System.out.println(source[i]);
        }
    /*    System.out.println();
        for (int i = 0; i <ignored.length ; i++) {
            System.out.println(ignored[i]);
        }
        System.out.println();

        for(int i=0;i<tracked.length;i++){
            System.out.println(tracked[i]);
        }
        System.out.println();*/


        for (int i = 0; i <ignored.length ; i++) {
            for (int j = 0; j <tracked.length ; j++) {
                if(ignored[i]==tracked[j]){
                    trackIgnoredCount++;
                   break;
                }
            }
        }
      /*  for(int i=0;i<source.length;i++){
           if(source[i]==ignored[i]||source[i]==tracked[i]){
                tiutui++;
            }
           else {
               untrackedUnIgnoredCount++;
           }
        }*/
        System.out.println(trackIgnoredCount);


    }
}
