import java.util.LinkedList;

public class LinkedListForEach {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(60);
        System.out.println("Using for each method");
        ll.forEach(n-> System.out.println(n));
        System.out.println("Using for each loop");
        for (Object o:ll
             ) {
            System.out.println(o);

        }

    }


}
