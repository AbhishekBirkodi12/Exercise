public class PatternQ {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((i == 0) && (j <= 8) || (j == 0) && (i <= 8) || (j == 8) && (i <= 8) || (i == 8) && (j <= 8) || ((i == j) && (i >= 5) && (j >= 5))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
