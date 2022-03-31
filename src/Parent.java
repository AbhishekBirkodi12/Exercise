

interface ParentInterface {
   void display();
  /* void display1();
   int a = 0;*/


}
interface ParentInterface1 extends /*implements*/ ParentInterface{
    void display3();
}
class ABC implements ParentInterface1{


    public void display() {
        System.out.println("Hello");
    }

    public void display1() {
        System.out.println("AbDb");
    }



    public static void main(String[] args) {
        //ParentInterface parent=new ParentInterface();
        ParentInterface parentInterface;
    }

    class Abcd extends ABC implements ParentInterface{
        public void display(){
            System.out.println("Heyyy");

        }    }

    public void display3() {
        System.out.println("Interface extended");
    }
}



