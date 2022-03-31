public class StringBufferAndStringBuilder {

    public static void main(String[] args) {
        String s1="Hello Guys";
        System.out.println(s1.hashCode());
        String s2="Hi";
        System.out.println(s2.hashCode());
        String s3=s1;
        System.out.println(s3.hashCode());
        String s4=new String("Hello");

        System.out.println(s3==s1);
        System.out.println(s4==s1);
        System.out.println(s1.equals(s2));
        StringBuffer b=new StringBuffer("RCB");
        StringBuilder y=new StringBuilder("Bangalore");
        System.out.println(s1);
        s2=s1.concat(s2);
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(b.append("RCB"));
        System.out.println(b);
        System.out.println(b.hashCode());
    }
}
