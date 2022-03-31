public class TheatreMultithreaded extends Thread {
    CustomerTheatre customerTheatre;
    String mode;

    public TheatreMultithreaded(CustomerTheatre customerTheatre, String mode){
       this.customerTheatre=customerTheatre;
        this.mode=mode;
    }
    public void run(){
        customerTheatre.withdraw(mode,customerTheatre);

    }

}
class CustomerTheatre{
    private String name;

    public CustomerTheatre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    synchronized static void withdraw(String mode,CustomerTheatre customerTheatre){
        for(int i=1;i<=5;i++){
            System.out.println("Booking seat for "+customerTheatre.getName()+" through "+mode);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class TheatreLaunch{
    public static void main(String[] args) {
        CustomerTheatre customerTheatre=new CustomerTheatre("Virat");
        CustomerTheatre customerTheatre1=new CustomerTheatre("Sachin");
        CustomerTheatre customerTheatre2=new CustomerTheatre("Dhoni");

        TheatreMultithreaded theatreMultithreaded =new TheatreMultithreaded(customerTheatre,"Atm");
        TheatreMultithreaded theatreMultithreaded1 =new TheatreMultithreaded(customerTheatre1,"Google pay");
        TheatreMultithreaded theatreMultithreaded2 =new TheatreMultithreaded(customerTheatre2,"PhonePay");

        theatreMultithreaded.start();
        theatreMultithreaded1.start();
        theatreMultithreaded2.start();
    }
}
