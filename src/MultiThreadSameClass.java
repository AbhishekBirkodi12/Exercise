public class MultiThreadSameClass extends Thread {
    public MultiThreadSameClass(){
        super();
    }
    public MultiThreadSameClass(String name){
        super(name);

    }
    public void printc(){

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println(Thread.currentThread());

    }
    public void printd(){

        for(char i='a';i<'z';i++){
            System.out.println(i);
        }
        System.out.println(Thread.currentThread());

    }
    public void run()
    {
        String name=this.getName();
        if(name.equalsIgnoreCase("printc")){
            this.printc();

        }
        else if(name.equalsIgnoreCase("printd")){
            this.printd();
        }
    }

    public static void main(String[] args) {
        MultiThreadSameClass multiThreadSameClass1=new MultiThreadSameClass("printc");
        MultiThreadSameClass multiThreadSameClass2=new MultiThreadSameClass("printd");
        multiThreadSameClass1.start();
        multiThreadSameClass2.start();

    }
}
