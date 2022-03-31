public class ThrowsException {
    void add() throws InterruptedException{
        Thread.sleep(1000);
    }

    }
class ThrowsDemoLaunch {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connection established");
     ThrowsException throwsException=new ThrowsException();
     throwsException.add();
        System.out.println("Connection terminated");

    }
}
