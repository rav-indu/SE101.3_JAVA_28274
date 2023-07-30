package lab_08_q2;

public class Lab_08_Q2 {

    public static void main(String[] args) 
    {
        // Create a Circle object with a radius of 5
        Circle circle = new Circle(5);

        // Print circle details
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        // Create a Rectangle object with length 4 and width 6
        Rectangle rectangle = new Rectangle(4, 6);

        // Print rectangle details
        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println();

        // Create a Triangle object with sides 3, 4, 5 and Perpendicular Height 2
        Triangle triangle = new Triangle(3, 4, 5, 2);

        // Print triangle details
        System.out.println("Triangle:");
        System.out.println("Side A: " + triangle.getSideA());
        System.out.println("Side B: " + triangle.getSideB());
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Perpendicular Height: " + triangle.getPerpendicularHeight());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
    
}
