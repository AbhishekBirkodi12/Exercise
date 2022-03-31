import java.util.Scanner;

public class StringCountWhitespaces {
    int count=0;
    public int spaceCount(String s){
        for(int i=0,c=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                count++;
            }

        }
        return count;

    }
    public static void main(String[] args) {


        StringCountWhitespaces stringCountWhitespaces=new StringCountWhitespaces();
        int res=stringCountWhitespaces.spaceCount("Welcome to Abc");
        System.out.println("Number of spaces are :"+res);

    }
}
