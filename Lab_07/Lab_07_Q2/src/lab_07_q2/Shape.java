package lab_07_q2;

public abstract class Shape 
{
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Non-abstract method to display
    public void display() {
        System.out.println("This is a shape.");
    }
}
