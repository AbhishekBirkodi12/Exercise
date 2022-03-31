public class ConstructerLocalChain {
    private String name;
    private int crn;
    private int balance;

    public ConstructerLocalChain(String name, int crn, int balance) {

        System.out.println("Three parameter constructor");
    }

    public ConstructerLocalChain(String name, int crn) {
         this("abd",466,1000);
        System.out.println("Two parameter constructor");
    }

    public ConstructerLocalChain(String name) {
        this("abc",3546);
        System.out.println("One parameter ");
    }

    public ConstructerLocalChain() {
        this("abc");
        System.out.println("No parameter");
    }
}
class ConstructerLocalChainLaunch{
    public static void main(String[] args) {
        ConstructerLocalChain constructerLocalChain=new ConstructerLocalChain();

    }
}
