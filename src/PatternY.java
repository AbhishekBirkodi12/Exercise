public class PatternY {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (((i == j) && (i <= 5) && (j <= 5)) || ((i + j == 10) && (i <= 5)) || ((j == 5) && (i >= 5))) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
