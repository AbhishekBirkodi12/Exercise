import java.util.*;

public class HashMapM {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(1,20);
        hashMap.put(91,230);
        hashMap.put(14,220);
        hashMap.put(12,220);
        hashMap.put(6,270);
        System.out.println(hashMap);
        Set s=hashMap.keySet();
        Iterator it=s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(hashMap.values());
        Collection c=hashMap.values();
        Iterator it1=c.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        Set y=hashMap.entrySet();
        Iterator it2=y.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}

