public class PatternNew1 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {

            for (int j = 1; j <= 6; j++) {

               if((j == 2) || (i == 1) || (j == 3) || (j == 5) || (j == 6)&&
                       (i==2)||(j==3)||(j==6)){
                   System.out.print("-");
               }else {
                   System.out.print("*");
               }

            }
            System.out.println();
        }
    }
}
