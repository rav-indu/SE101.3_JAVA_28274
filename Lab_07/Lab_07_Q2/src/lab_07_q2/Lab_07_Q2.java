package lab_07_q2;

public class Lab_07_Q2 {

    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);

        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

        circle.display();
    }
    
}
