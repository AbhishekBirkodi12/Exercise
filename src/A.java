public class A {
    void display(){
        System.out.println("Class A method1");
    }
}

class B extends  A{
    }
class C extends B{


}
class D extends C{

}

class E extends C{
    public static void main(String[] args) {
        A a=new A();
        a.display();
        B b=new B();
        b.display();
        C c=new C();
        c.display();
        D d=new D();
        d.display();
        E e=new E();
        e.display();

    }




}





