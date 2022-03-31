import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

public class ArrayListStructuralModification {
    public static void main(String[] args) {
        CopyOnWriteArrayList al=new CopyOnWriteArrayList();
        al.add(50);
        al.add(10);
        al.add(30);
        al.add(5);

      /*  for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
            al.add(99);
        }*/

        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            al.add(99);
        }
    }
}
