import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperClass {
    public static void main(String[] args) throws IOException {
        Integer i=new Integer(20);
        System.out.println(i);
       /*Integer o=new Integer("hzgdhdf");*//**/
       /* System.out.println(o);*/
        Float f=new Float(12.25);
        System.out.println(f);
        Short s=new Short((short) 23);
        System.out.println(s);
        Long l=new Long(12);
        System.out.println(l);
        Byte b= (byte) 28;
        System.out.println(b);

      /*  InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("Enter the string");
        String a=bufferedReader.readLine();
        System.out.println(a);*/
    }
}

