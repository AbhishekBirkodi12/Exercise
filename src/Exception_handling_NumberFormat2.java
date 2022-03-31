import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Exception_handling_NumberFormat2 {
    private String name;
    private double deposit;
    private double costPerDay;

    public Exception_handling_NumberFormat2(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }
}
class LaunchNumberFormat{
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Connection established");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name");
        String name=bufferedReader.readLine();
        System.out.println("Enter the deposit");
        double deposit=Double.parseDouble(bufferedReader.readLine());
        System.out.println("Enter the cost per day");
        double costPerDay= Double.parseDouble((bufferedReader.readLine()));
        Exception_handling_NumberFormat2 e=new Exception_handling_NumberFormat2(name,deposit,costPerDay);
        System.out.println("Details of the item type are: ");
        System.out.println("Name :"+e.getName()+"\n"+"Deposit: "+e.getDeposit()+"\n"+"CostPerDay :"+e.getCostPerDay());

        }catch (NumberFormatException e){
            System.out.println("Number format exception handled");
        }
        System.out.println("Connection terminated");
    }
}
