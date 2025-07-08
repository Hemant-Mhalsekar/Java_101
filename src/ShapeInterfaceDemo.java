import java.util.Scanner;

interface Shape {
    void calculateArea();

    void calculatePerimeter();
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

public class ShapeInterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);
        square.calculateArea();
        square.calculatePerimeter();
        System.out.print("\nEnter radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.calculateArea();
        circle.calculatePerimeter();
        sc.close();
    }
}