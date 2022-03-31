import java.nio.channels.MulticastChannel;

public class MultiThreadBankSirMethod extends Thread{
    CustomerSir customerSir;
    String mode;

    public MultiThreadBankSirMethod(CustomerSir customerSir,String mode){
        this.customerSir=customerSir;
        this.mode=mode;
    }
    public void run(){
        customerSir.withdraw(mode);

    }
}
class CustomerSir{

   synchronized void withdraw(String mode){
        for(int i=1;i<=5;i++){
            System.out.println("Withdrawing money through "+mode);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MultiSirLaunch{
    public static void main(String[] args) {
      CustomerSir customerSir=new CustomerSir();

        MultiThreadBankSirMethod multiThreadBankSirMethod=new MultiThreadBankSirMethod(customerSir,"Atm");
        MultiThreadBankSirMethod multiThreadBankSirMethod1=new MultiThreadBankSirMethod(customerSir,"PhonePay");
        MultiThreadBankSirMethod multiThreadBankSirMethod2=new MultiThreadBankSirMethod(customerSir,"GooglePay");

        multiThreadBankSirMethod.start();
        multiThreadBankSirMethod1.start();
        multiThreadBankSirMethod2.start();
    }


}


