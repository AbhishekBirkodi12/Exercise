import java.util.Scanner;

public class StringCompareWithoutBuiltInInterview {
    public static void main(String[] args) {
        System.out.println("Enter the first string ");
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        System.out.println("Enter the second string");
        String s2=scanner.next();
        System.out.println("Entered String1 "+s1+" And String2 "+s2+" are equal? "+compare(s1,s2));
    }

     static boolean compare(String s1, String s2) {
        if(s1==null||s2==null){
            return false;
        }
        else if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
