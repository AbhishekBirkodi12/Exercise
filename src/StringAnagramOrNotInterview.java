import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramOrNotInterview {
    public static void main(String[] args) {
        System.out.println("Enter the first string");
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        System.out.println("Enter the second string");
        String s2=scanner.next();


        System.out.println("Are string s1 "+ s1+" and s2 "+s2+ " anagram?:"+checkAnagram(s1,s2));

    }

    public static boolean checkAnagram(String s1, String s2) {

        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result=Arrays.equals(a,b);
        return result;
    }
}
