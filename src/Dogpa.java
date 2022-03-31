public class Dogpa {
    int cost=100;
    String name="yyyy";

    @Override
    public String toString() {
        return "Dogpa{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
class DemoDogPa{
    public static void main(String[] args) {
        String s="hvsd";
        s.charAt(0);
        Dogpa dogpa=new Dogpa();
        System.out.println(dogpa);

    }
}
