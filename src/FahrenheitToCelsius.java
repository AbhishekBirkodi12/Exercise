import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in Fahrenheit :");
        Scanner scanner=new Scanner(System.in);
        Double fahrenheit=scanner.nextDouble();
        Double celsius=(fahrenheit-32)*5/9;
        System.out.println("Temperature in Celsius for the given temperature in Fahrenheit is : "+celsius);
    }
}
