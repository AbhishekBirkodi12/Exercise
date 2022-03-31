public class MultiCustomerWait extends Thread {
    int balance = 10000;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("transaction started");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            balance = balance - 1000;
            System.out.println("Withdraw complete");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            notify();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("transaction closed");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}

class DemoWait {
    public static void main(String[] args) {
        MultiCustomerWait multiCustomerWait = new MultiCustomerWait();
        System.out.println("Balance before transaction " + multiCustomerWait.balance);
        multiCustomerWait.start();
        synchronized (multiCustomerWait) {
            try {
                multiCustomerWait.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Balance After transaction " + multiCustomerWait.balance);

    }

}

