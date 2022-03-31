public class MultiChangeContstructer1 extends Thread {
    public MultiChangeContstructer1(String s) {
        super(s);

    }


    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class DemoConstructor{
    public static void main(String[] args) {
        MultiChangeContstructer1 multiChangeContstructer1=new MultiChangeContstructer1("abc");
        multiChangeContstructer1.start();

    }

}
