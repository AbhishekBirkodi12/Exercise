public class MultiThreadPriorityCheck extends Thread {
public MultiThreadPriorityCheck(String s){
    super(s);

}
public void run(){
    for (int i = 1; i <= 10; i++) {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
}
class DemoPr{
    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        MultiThreadPriorityCheck multiThreadPriorityCheck=new MultiThreadPriorityCheck("abc");
        multiThreadPriorityCheck.start();
    }
}
