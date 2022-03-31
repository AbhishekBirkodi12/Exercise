import java.util.ArrayDeque;

public class ArrayDequePeekFirstAndPeekLast {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add(20);
        ad.add(10);
        ad.add(40);
        ad.add(60);
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.peekLast());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);
    }
}
