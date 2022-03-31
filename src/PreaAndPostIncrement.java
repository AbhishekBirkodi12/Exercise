public class PreaAndPostIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a++ + ++a + ++b + ++b;
        System.out.println(c);
        int d=a + b + b++ + a++ + b;
        System.out.println(d);
        int e=++a + ++b + ++b;
        System.out.println(e);

    }
}
