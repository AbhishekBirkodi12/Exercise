class CalculatorException{
    int a=10;
    int b=0;
    void division(){
        try{
            int c=a/b;
        }catch(Exception e){
            System.out.println("Handled");
            throw e;
        }
        finally {

            System.out.println("Critical statements");
        }
    }

}
public class RethrowingException {
    public static void main(String[] args) {
        System.out.println("Connection established");
        CalculatorException calculatorException=new CalculatorException();

        try{
        calculatorException.division();
        }catch (Exception e){
            System.out.println("Connection is terminated");
        }
    }
}
