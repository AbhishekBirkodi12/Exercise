import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        Double areaOfCircle = 3.142 * r * r;
        System.out.println("Area of circle is:" + areaOfCircle);

        System.out.println("Enter the side of the square");
        double side = scanner.nextDouble();
        Double areaOfSquare = side * side;
        System.out.println("Area of the square is :" + areaOfSquare);


        System.out.println("Enter the base of the triangle");
        Double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle");
        Double height = scanner.nextDouble();
        Double areaofTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle is :" + areaofTriangle);


    }
}
