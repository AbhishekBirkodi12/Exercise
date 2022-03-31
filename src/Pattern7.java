public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int s = 1; s <= 4; s++) {
                System.out.print("-");
            }
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
