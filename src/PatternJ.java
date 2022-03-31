public class PatternJ {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((i == 0) || (j == 7) && (i <= 6) || (j == 6) && (i == 7) || (j == 5) && (i == 7) || (j == 4) && (i == 7) || (j == 2) && (i == 6) || (j == 1) && (i == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
