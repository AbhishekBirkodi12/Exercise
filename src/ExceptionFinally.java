public class ExceptionFinally {
    public static void main(String[] args) {
        System.out.println("Connection established");
        int a=10;
        int b=0;
        try {
            int c=a/b;
        }catch(Exception e){
            System.out.println("Handled");
        }finally {
            System.out.println("Connection terminated");
        }

    }
}
