public class MultiplesOf3And5WithMethods {
    void multiplesOFThree() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("3" + "x" + i + "=" + (3 * i));
        }

    }

    void multiplesOfFive() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("5" + "x" + i + "=" + (5 * i));
        }


    }

    public static void main(String[] args) {
        MultiplesOf3And5WithMethods multiplesOf3And5WithMethods = new MultiplesOf3And5WithMethods();
        multiplesOf3And5WithMethods.multiplesOFThree();
        System.out.println("===========================================================================");
        multiplesOf3And5WithMethods.multiplesOfFive();
    }
}
