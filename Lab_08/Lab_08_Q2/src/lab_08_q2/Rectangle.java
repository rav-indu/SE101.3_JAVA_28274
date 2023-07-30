package lab_08_q2;

public class Rectangle implements Shape
{
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (length * width);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * (length + width));
    }
}
