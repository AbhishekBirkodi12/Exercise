public class StringTest {
    public static void main(String[] args) {
        String s3="abc";
        String s1="ABC";
        String s2=new String("ABC");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.substring(1));
    }
}
