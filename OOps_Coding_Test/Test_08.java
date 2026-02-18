package OOps_Coding_Test;

public class Test_08 {
    //Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle
    // " and "Circle" and implement "getArea()" for each.

    // Main class to demonstrate the implementation

        public static void main(String[] args) {
            // Create a Rectangle object with length=5, width=3
            Shape rectangle = new Rectangle(5, 3);
            // Create a Circle object with radius=4
            Shape circle = new Circle(4);

            // Print the area of the Rectangle
            System.out.println("Area of the Rectangle: " + rectangle.getArea());
            // Print the area of the Circle
            System.out.println("Area of the Circle: " + circle.getArea());
        }

}

abstract class Shape {
    // Abstract method getArea() to be implemented by subclasses
    public abstract double getArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of getArea() for Rectangle (Area = length * width)
    @Override
    public double getArea() {
        return length * width;
    }
}

// Subclass Circle
 class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea() for Circle (Area = PI * radius * radius)
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}




