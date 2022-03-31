public class Producer extends Thread {
    Factory factory;

    public Producer(Factory factory) {
        this.factory = factory;
    }

    public void run(){
        factory.production();
    }
}
class Consumer extends Thread{
    Factory factory;

    public Consumer(Factory factory) {
        this.factory = factory;
    }
    public void run(){
        factory.consumption();
    }
}

class Factory{
    public void production(){

        synchronized (this){
            notify();
            System.out.println("Production is progress");
        }




        synchronized (this){
            System.out.println("Consumer is waiting");
            try {
                Thread.sleep(1000);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (this){
            System.out.println("Consumption is complete");
            notify();
        }


    }
    public void consumption(){
        synchronized (this){
            System.out.println("Production is complete");
            notify();
        }



        synchronized (this){
            System.out.println("Consumption in progress");
            System.out.println("Producer is waiting");
            try {
                Thread.sleep(1000);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (this){

            notify();
        }
        
    }

}
class LaunchProducerConsumer{
    public static void main(String[] args) {
        Factory factory=new Factory();
        Producer producer=new Producer(factory);
        Consumer consumer=new Consumer(factory);
        producer.start();
        consumer.start();
    }
}
