import java.util.ArrayDeque;

public class ArrayDequePeekAndPoll {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add(20);
        ad.add(10);
        ad.add(40);
        ad.add(60);
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad);
    }


}
