import java.util.Scanner;

public class StringReplaceWith1And2Interview {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        s1=s1.toLowerCase();
        char str[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++){
            if(str[i]=='a'||str[i]=='e'||str[i]=='o'||str[i]=='u'){
                str[i]='1';
            }else if(str[i]==' '){
                str[i]='2';
            }
        }
        System.out.println(str);
    }
}
