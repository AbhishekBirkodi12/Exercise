import java.util.LinkedList;

public class LinkedListSimpleFor {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(60);
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
    }
}
