public class ConstructerOverloading {
 private String name;
 private int crn;
 private int balance;

    public ConstructerOverloading(String name, int crn, int balance) {
        this.name = name;
        this.crn = crn;
        this.balance = balance;
        System.out.println("This is three parameter constructor");

    }

    public ConstructerOverloading(String name, int balance) {
        this.name = name;
        this.balance = balance;
        System.out.println("This is two parameter constructor");

    }


    public ConstructerOverloading(String name) {
        this.name = name;
        System.out.println("This is one parameter constructor");

    }

    public ConstructerOverloading() {
        System.out.println("This is no args constructor");
    }
}
class ConstructerOverloadingLaunch{
    public static void main(String[] args) {
        ConstructerOverloading constructerOverloading=new ConstructerOverloading();
        ConstructerOverloading constructerOverloading1 = new ConstructerOverloading("Abhishek");
        ConstructerOverloading constructerOverloading2 = new ConstructerOverloading("Abhishek",23456);
        ConstructerOverloading constructerOverloading3 = new ConstructerOverloading("Abhishek",6125365,5977899);
    }



}
