import java.util.Scanner;

public class StringMultipleofThreeindex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String a=scanner.next();
        int l=a.length();
        for (int i = 0; i <l; i++) {
           if(i%3==0){
               System.out.print(a.charAt(i));
           }

        }
    }

}
