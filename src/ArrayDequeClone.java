import java.util.ArrayDeque;

public class ArrayDequeClone {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ArrayDeque ad1=new ArrayDeque();
        ad.add(20);
        ad.add(10);
        ad.add(40);
        ad.add(60);
        ad1=ad.clone();
        System.out.println("Copy is ");
        System.out.println(ad1);
    }
}
