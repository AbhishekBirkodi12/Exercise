public class CustomerConstructer {
    private String name;
    private int crn;
    private int balance;

    public CustomerConstructer(String name, int crn, int balance) {
        this.name = name;
        this.crn = crn;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getCrn() {
        return crn;
    }

    public int getBalance() {
        return balance;
    }
}
class LauchCunctructor{
    public static void main(String[] args) {
        CustomerConstructer customerConstructer=new CustomerConstructer("abc",12345,5000);
        System.out.println(customerConstructer.getName());
        System.out.println(customerConstructer.getCrn());
        System.out.println(customerConstructer.getBalance());
    }
}
