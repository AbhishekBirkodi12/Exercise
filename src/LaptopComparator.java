import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopComparator {
    private String brand;
    private int ram;
    private int price;

    public LaptopComparator(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }



}
class Runner1{
    public static void main(String[] args) {
        List<LaptopComparator> lap=new ArrayList<>();
        lap.add(new LaptopComparator("Dell",16,800));
        lap.add(new LaptopComparator("Mac",8,1200));
        lap.add(new LaptopComparator("Hp",12,950));
        System.out.println("Before sorting");
        System.out.println(lap);
        Comparator<LaptopComparator>comparator=new Comparator<LaptopComparator>() {
            public int compare(LaptopComparator l1,LaptopComparator l2){
                if(l1.getPrice()>l2.getPrice()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };
        Collections.sort(lap,comparator);
        System.out.println("After sorting");
        System.out.println(lap);
    }
}
