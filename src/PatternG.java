public class PatternG {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((i == 0) || (j == 0) || (i == 10) && (j <= 5) || (j == 5) && (i >= 6) || (i == 6) && (j >= 5) || (j == 10) && (i >= 6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
