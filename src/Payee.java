import java.util.Scanner;

public class Payee {
    private String name;
    private String bankName;
    private String ifscCode;
    private String aadharId;
    private double amount;

    Payee addPayee(String name,String bankName,String ifscCode,double depositAmount){
        Payee p2=new Payee();
         if((this.name.equals(name))&&(this.bankName.equals(bankName))&&(this.ifscCode.equals(ifscCode))){
             System.out.println("Amount added successfully");
             this.amount=this.amount+depositAmount;
             System.out.println("Current Balance of "+this.name+" is "+this.amount);



         }else{
             System.out.println("Payee Not Found");
         }
         return p2;

    }

    Payee addPayee(String aadharId,String ifscCode,double depositAmount){
        Payee p=new Payee();

      if((this.aadharId.equals(aadharId))&&(this.ifscCode.equals(ifscCode))){
          this.amount=this.amount+depositAmount;
          System.out.println("Amount deposited successfully");
          System.out.println("Current Balance of "+this.name+" is "+this.amount);
      }else {
          System.out.println("Payee Not Found");
      }
      return p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAadharId() {
        return aadharId;
    }

    public void setAadharId(String aadharId) {
        this.aadharId = aadharId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
class Launch{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Payee payee=new Payee();
        System.out.println("Enter the name");
        String name=scanner.next();
        System.out.println("Enter the bank name");
        String bankName=scanner.next();
        System.out.println("Enter the ifsc code");
        String ifsc=scanner.next();
        System.out.println("Enter the Aadhar id ");
        String aadharId=scanner.next();
        System.out.println("Enter the amount");
        double amount=scanner.nextDouble();
        payee.setName(name);
        payee.setBankName(bankName);
        payee.setIfscCode(ifsc);
        payee.setAadharId(aadharId);
        payee.setAmount(amount);
        System.out.println(payee.getName());
        System.out.println(payee.getIfscCode());
        System.out.println(payee.getAadharId());
        System.out.println(payee.getBankName());

        System.out.println("1) Pay using name,bankName and ifsc code\n2) Pay using aadharId and ifsc code");
        System.out.println("Enter your choice");
        int choice=scanner.nextInt();
        if(choice==1){
            System.out.println("Enter the payee account name");
            String payeeName=scanner.next();
            System.out.println("Enter the bankName");
            String payeeBankName=scanner.next();
            System.out.println("Enter their ifsc code");
            String payeeIfsc=scanner.next();
            System.out.println("Enter the amount to deposite");
            double payeeAmount=scanner.nextDouble();
            Payee p=payee.addPayee(payeeName,payeeBankName,payeeIfsc,payeeAmount);


        }else{
            System.out.println("Enter the payee aadharId");
            String payeeAadharId=scanner.next();
            System.out.println("Enter the payee ifsc code");
            String payeeIfscCode=scanner.next();
            System.out.println("Enter the payee deposit amount");
            double payeeAmount=scanner.nextDouble();
            Payee p1=payee.addPayee(payeeAadharId,payeeIfscCode,payeeAmount);
        /*    System.out.println(p1.getAmount());*/

        }

    }

}