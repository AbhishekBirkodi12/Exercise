public class CalculatorWithNoIpAndOp {
    int a,b,c;
    void add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        CalculatorWithNoIpAndOp calculator=new CalculatorWithNoIpAndOp();
        calculator.add();
    }

}
