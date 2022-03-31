import java.util.Scanner;

public class BloodDonationCamp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Age");
        int age=scanner.nextInt();
        System.out.println("Please enter your weight");
        int weight=scanner.nextInt();
        if((age>=18)&&(weight>=50)){
            System.out.println("welcome on camp you can donate blood");
        }else{
            System.out.println("we Appreciate your effort we are sorry you are not eligible for blood donation!!!");
        }
    }
}
