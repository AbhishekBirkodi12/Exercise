public class MultiThreadingDaemon extends Thread {
    public void typing(){
        for(int i=1;i<=10;i++){
            System.out.println("typing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void autocorrection(){
        for (;;){
            System.out.println("autocorrection");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void autocompletion(){
        for (;;){
            System.out.println("autocompletion");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void run()
    {
        String name=this.getName();
        if(name.equalsIgnoreCase("typing")){
            this.typing();

        }
        else if(name.equalsIgnoreCase("autocorrection")){
            this.autocorrection();
        }
        else if(name.equalsIgnoreCase("autocompletion")){
            this.autocompletion();
        }
    }

    public static void main(String[] args) {
        MultiThreadingDaemon multiThreadingDaemon1=new MultiThreadingDaemon();
        MultiThreadingDaemon multiThreadingDaemon2=new MultiThreadingDaemon();
        MultiThreadingDaemon multiThreadingDaemon3=new MultiThreadingDaemon();

        multiThreadingDaemon1.setName("typing");
        multiThreadingDaemon2.setName("autocorrection");
        multiThreadingDaemon3.setName("autocompletion");

        multiThreadingDaemon2.setDaemon(true);
        multiThreadingDaemon3.setDaemon(true);

        multiThreadingDaemon2.setPriority(1);
        multiThreadingDaemon3.setPriority(1);

        multiThreadingDaemon1.start();
        multiThreadingDaemon2.start();
        multiThreadingDaemon3.start();

    }

}
