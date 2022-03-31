public class Dogd {
    int cost=100;
    String name="yyyy";

    @Override
    public String toString() {
        return "Dogd{" + "cost=" + cost + ", name='" + name + '\'' + '}';
    }
}

class LaunchDogd{
    public static void main(String[] args) {
        Dogd[] dogd=new Dogd[5];
        dogd[0]=new Dogd();
        dogd[1]=new Dogd();
        dogd[2]=new Dogd();
        dogd[3]=new Dogd();
        System.out.println(dogd[0]);
        System.out.println(dogd[1]);
        System.out.println(dogd[2]);
        System.out.println(dogd[3]);




    }
}
