import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopComparable implements Comparable<LaptopComparable>{
    private String brand;
    private int ram;
    private int price;

    public LaptopComparable(String brand, int ram, int price) {
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

    @Override
    public int compareTo(LaptopComparable lap2) {
     if(this.getRam()>lap2.getRam()){
         return 1;
     }else {
         return -1;
     }
    }
}
class Runner{
    public static void main(String[] args) {
        List<LaptopComparable> lap=new ArrayList<>();
        lap.add(new LaptopComparable("Dell",16,800));
        lap.add(new LaptopComparable("Mac",8,1200));
        lap.add(new LaptopComparable("Hp",12,950));
        System.out.println("Before sorting");
        System.out.println(lap);

        Collections.sort(lap);
        System.out.println("After sorting");
        System.out.println(lap);
    }
}

