import java.util.Scanner;

public class MultiThreadBank extends Thread {

    public void withDrawAmountInBankATM(Customer12 customer12){
        System.out.println("Your withdrawal was successful");
        System.out.println("Your current balance is"+(customer12.getBalance()-customer12.getWithdrawalAmount()));

    }
    public void withDrawAmountInPhonePay(Customer12 customer12){
        System.out.println("Your withdrawal was successful");
        System.out.println("Your current balance is"+(customer12.getBalance()-customer12.getWithdrawalAmount()));

    }
    public void withDrawAmountInGooglePay(Customer12 customer12){
        System.out.println("Your withdrawal was successful");
        System.out.println("Your current balance is"+(customer12.getBalance()-customer12.getWithdrawalAmount()));

    }

    public void run(Customer12 customer12){
        String name=this.getName();
        if(name.equalsIgnoreCase("ATM")){
            this.withDrawAmountInBankATM(customer12);

        }
        else if(name.equalsIgnoreCase("PhonePay")){
            this.withDrawAmountInPhonePay(customer12);
        }
        else if(name.equalsIgnoreCase("GooglePay")){
            this.withDrawAmountInGooglePay(customer12);
        }
    }

}
class Customer12{
    private String name;
    private int accountNumber;
    private int balance;
    private int withdrawalAmount;

    public Customer12(String name, int accountNumber, int balance, int withdrawalAmount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }


    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }
}
class LunchWithdraw{
    public static void main(String[] args) {
        System.out.println("Enter the customer name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Enter the account number");
        int accountNumber=scanner.nextInt();
        System.out.println("Enter the current balance");
        int balance=scanner.nextInt();

    }
}
