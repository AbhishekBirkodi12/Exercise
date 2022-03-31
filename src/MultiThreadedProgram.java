public class MultiThreadedProgram extends Thread {
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

class Task2 extends Thread {
    public void run() {

        for (char j = 'a'; j <= 'j'; j++) {
            System.out.println(j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class DemoMultiThread {
    public static void main(String[] args) {
        MultiThreadedProgram multiThreadedProgram = new MultiThreadedProgram();
        Task2 task2 = new Task2();
        multiThreadedProgram.start();
        task2.start();

    }
}
