import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(23);
        arrayList.add(12);
        arrayList.add(49);
        arrayList.add(39);
        arrayList.add(8);
        System.out.println("Before sorting \n"+arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting \n"+arrayList);
        System.out.println(Collections.binarySearch(arrayList,49));
    }
}
