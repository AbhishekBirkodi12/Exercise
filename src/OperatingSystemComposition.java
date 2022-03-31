public class OperatingSystemComposition {
  private String name;

    public OperatingSystemComposition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Charger{
    private String name;

    public Charger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Mobilecomp{
   OperatingSystemComposition operatingSystemComposition=new OperatingSystemComposition("Android");
   void hasA(Charger c){
       System.out.println(c.getName());
   }


}

class LaunchOpComp{
    public static void main(String[] args) {
       Mobilecomp mobilecomp=new Mobilecomp();
       Charger charger=new Charger("samsung");
        System.out.println(mobilecomp.operatingSystemComposition.getName());
        mobilecomp.hasA(charger);
        System.out.println(charger.getName());
        //After making mobilcomp=null
        mobilecomp=null;
        System.out.println(charger.getName());
        System.out.println(mobilecomp.operatingSystemComposition.getName());


    }

}
