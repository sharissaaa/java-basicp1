import java.io.*;

public class ShapeAreaCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Trapezoid");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = Double.parseDouble(reader.readLine());
                Circle circle = new Circle(radius);
                circle.calculateArea();
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = Double.parseDouble(reader.readLine());
                System.out.print("Enter the width of the rectangle: ");
                double width = Double.parseDouble(reader.readLine());
                Rectangle rectangle = new Rectangle(length, width);
                rectangle.calculateArea();
                break;
            case 3:
                System.out.print("Enter the length of the trapezoid: ");
                double trapezoidLength = Double.parseDouble(reader.readLine());
                System.out.print("Enter the length of the top side of the trapezoid: ");
                double topLength = Double.parseDouble(reader.readLine());
                System.out.print("Enter the height of the trapezoid: ");
                double trapezoidHeight = Double.parseDouble(reader.readLine());
                Trapezoid trapezoid = new Trapezoid(trapezoidLength, topLength, trapezoidHeight);
                trapezoid.calculateArea();
                break;
            case 4:
                System.out.print("Enter the base of the triangle: ");
                double base = Double.parseDouble(reader.readLine());
                System.out.print("Enter the height of the triangle: ");
                double height = Double.parseDouble(reader.readLine());
                Triangle triangle = new Triangle(base, height);
                triangle.calculateArea();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}

class Trapezoid {
    private double length;
    private double topLength;
    private double height;

    public Trapezoid(double length, double topLength, double height) {
        this.length = length;
        this.topLength = topLength;
        this.height = height;
    }

    public void calculateArea() {
        double area = 0.5 * (length + topLength) * height;
        System.out.println("Area of the trapezoid: " + area);
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
}
