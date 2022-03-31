public class MethodWithOpAndNoIP {
    int a,b,c;
    int add(int i, int i1){
        a=10;
        b=10;
        c=a+b;
        return c;
    }

    public static void main(String[] args) {
        MethodWithOpAndNoIP methodWithOpAndNoIP=new MethodWithOpAndNoIP();
        System.out.println(methodWithOpAndNoIP.add(5, 3));

    }
}
