import java.util.Scanner;

public class CustomException extends Exception{
   public CustomException(String s){
       super(s);
   }
    /*public String getMessage() {
        return "Wrong Credential";
    }*/
}
class Atm{
    Scanner scanner=new Scanner(System.in);
    int accountNumber;
    String pass;
   void input(){
       System.out.println("Enter the Account Number");
        accountNumber=scanner.nextInt();
       System.out.println("Enter the password");
        pass=scanner.next();
   }
   void verify(Bank bank) throws CustomException {
       if(accountNumber==bank.getAccNumber()&&pass.equals(bank.getPassword())){
           System.out.println("Credentials Accepted");
       }
       else{

           throw new CustomException("Wrong credential");
           }



       }

   }

class Bank{
    private int accNumber;
    private String Password;

    public Bank(int accNumber, String password) {
        this.accNumber = accNumber;
        Password = password;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getPassword() {
        return Password;
    }
}
class MainLaunchAtm{
    public static void main(String[] args) {
        Bank bank=new Bank(123456,"abhi@123");
        Atm atm=new Atm();

        try {
            atm.input();
            atm.verify(bank);
        } catch (CustomException e) {
            try{
               atm.input();
               atm.verify(bank);
            }catch (CustomException e1){
                System.out.println(e1.getMessage());
                System.out.println("Try again after 24 hours");


            }
        }

    }
}