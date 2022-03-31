

public class Task1 implements Runnable {



    public void run() {
    for (int i=1;i<=10;i++){
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

}
class Task2imp implements Runnable{


    public void run() {
        for(char i='a';i<'j';i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class LaunchImp{
    public static void main(String[] args) {
        Task1 task1=new Task1();
        Task2 task2=new Task2();

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
    }
}
