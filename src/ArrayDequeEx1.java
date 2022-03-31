import java.util.ArrayDeque;

public class ArrayDequeEx1 {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add(20);
        ad.add(10);
        ad.add(40);
        ad.add(60);
        ad.addFirst(23);
        ad.addLast(78);
        ad.add(19);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad);

    }
}
