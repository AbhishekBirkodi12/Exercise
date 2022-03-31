abstract public class Abstract {
    abstract void display();
    public void display1(){
        System.out.println("AB");
    }

/*
    public static void main(String[] args) {
       // Abstract abstract=new Abstract();
        Abstract a;
    }
*/

}
class Abstract1 extends Abstract{
    void display(){
        System.out.println("hi");
    }
    public void display3(){
        System.out.println("DE");
    }

    public static void main(String[] args) {
        Abstract1 abstract1=new Abstract1();
        abstract1.display1();
        abstract1.display();
        abstract1.display3();
    }
}