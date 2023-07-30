package lab_08_q2;

public class Triangle implements Shape
{
    private double sideA;
    private double sideB;
    private double Base;
    private double PerpendicularHeight;
    

    // Constructor
    public Triangle(double sideA, double sideB, double Base, double PerpendicularHeight) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.Base = Base;
        this.PerpendicularHeight = PerpendicularHeight;
    }

    // Getters
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getBase() {
        return Base;
    }
    
    public double getPerpendicularHeight() {
        return PerpendicularHeight;
    }

    // Setters
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    public void setPerpendicularHeight(double PerpendicularHeight) {
        this.PerpendicularHeight = PerpendicularHeight;
    }
    
    @Override
    public double calculateArea() {
        return (0.5*Base*PerpendicularHeight);
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB + Base);
    }
}
