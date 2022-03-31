public class Buffer {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("RCB");
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s.append("Bangalore"));
        System.out.println(s.hashCode());

        StringBuilder s1=new StringBuilder("Ab");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s1.append("devilliers"));
        System.out.println(s1.hashCode());

    }
}

