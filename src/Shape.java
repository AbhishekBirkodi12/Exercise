import java.util.Scanner;

abstract public class Shape {
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    float radius;


    public double calculatePerimeter() {
        return 3.142 * (2 * radius);
    }
}

class Rectangle extends Shape {
    float length;
    float breadth;

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Shape {

    float side;

    public double calculatePerimeter() {
        return 4 * side;
    }
}

class LaunchShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of shapes:\n1.Circle\n2.Rectangle\n3.Square");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle");
                float radius = scanner.nextFloat();
                Circle circle = new Circle();
                circle.radius = radius;
                System.out.println("Perimeter of Circle is :" + circle.calculatePerimeter());
                break;
            case 2:
                System.out.println("Enter the length of the rectangle");
                float length = scanner.nextFloat();
                System.out.println("Enter the breadth of the rectangle");
                float breadth = scanner.nextFloat();
                Rectangle rectangle = new Rectangle();
                rectangle.length = length;
                rectangle.breadth = breadth;
                System.out.println("Perimeter of Rectangle  is :" + rectangle.calculatePerimeter());
                break;
            case 3:
                Square square = new Square();
                System.out.println("Enter the side of the square");
                float side = scanner.nextFloat();
                square.side = side;
                System.out.println("Perimeter of Square is :" + square.calculatePerimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}
