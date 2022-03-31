import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(120);

        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(40);
        al1.add(120);
      /*  System.out.println("Without add index");
        System.out.println(al);

        al.add(3,'f');
        System.out.println("With add index");
        System.out.println(al);
        al.set(3,'s');
        System.out.println("With set index");
        System.out.println(al);*/


       // System.out.println(al.isEmpty());
       // System.out.println(al.indexOf(10));
        //System.out.println(al.get(1));
        //System.out.println(al.hashCode());

        //System.out.println(al.lastIndexOf(20));
        //System.out.println(al);
        //System.out.println(al.remove(0));
       // System.out.println(al);
       //System.out.println(al.size());
        // System.out.println(al.remove(al));
        //System.out.println(al);
       // System.out.println(al.removeAll(al));
        //System.out.println(al);
       // System.out.println(al.retainAll(al1));
        //System.out.println(al);
       // System.out.println(al.subList(0,3));
//       Object a[]= al.toArray();
//       for(Object object:a){
//           System.out.print(object+" ");
//       }

//        System.out.println(al.contains(12));
       // System.out.println(al.containsAll(al));
       // System.out.println(al.equals(al));

//        String u=al.toString();
//        System.out.println(u);

         al.clear();
        System.out.println(al);

    }
}
