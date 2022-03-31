public class Task1MultiThreadingChangeNamePriority implements Runnable {
    public void run() {
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

class Task2MultiThreadingChangePriority implements Runnable {
    public void run() {
        for (char i = 'a'; i <= 'j'; i++) {

            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LaunchChangeNameMulti {
    public static void main(String[] args) {

        Thread t11 = Thread.currentThread();
        System.out.println(t11);
        System.out.println(Thread.currentThread().getName());
        t11.setName("abc");
        System.out.println(Thread.currentThread());
        t11.setPriority(8);
        System.out.println(Thread.currentThread());
        Task1MultiThreadingChangeNamePriority task1MultiThreadingChangeNamePriority = new Task1MultiThreadingChangeNamePriority();
        Task2MultiThreadingChangePriority task2MultiThreadingChangePriority = new Task2MultiThreadingChangePriority();
        Thread t1 = new Thread(task1MultiThreadingChangeNamePriority);
        Thread t2 = new Thread(task2MultiThreadingChangePriority);
        t1.start();
        t2.start();
    }
}
