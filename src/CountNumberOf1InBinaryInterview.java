import java.util.Scanner;

public class CountNumberOf1InBinaryInterview {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        String s="";
        while (n>0){
            int a=n%2;
            s=a+s;
            n=n/2;
        }
        System.out.println("Binary form is "+s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println("Number of 1's are :"+count);
    }
}
