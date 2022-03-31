import java.util.Scanner;

public class SingleThreadedProgram {

        void printn(){
            for(int i=0;i<=10;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        void printC(){
            for(char i='a';i<'z';i++){
                System.out.println(i);
            }
        }
        void add(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number");
            int a=scanner.nextInt();
            System.out.println("Enter the second number");
            int b=scanner.nextInt();
            System.out.println(a+b);
        }
    }
class DemoThread{
    public static void main(String[] args) {
        SingleThreadedProgram singleThreadedProgram=new SingleThreadedProgram();
        singleThreadedProgram.printn();
        singleThreadedProgram.printC();
        singleThreadedProgram.add();
        Thread t1=Thread.currentThread();
        System.out.println(t1);
    }
}
