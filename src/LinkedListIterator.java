import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(60);
        System.out.println("Using Iterator");
        Iterator it=ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
