package containervolume;

public abstract class Container 
{
    private double height;
    private double radius;
    
    public abstract double calVolume();

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    } 
    
    public double getHeight() {
        return height;
    }
    
    public double getRadius() {
        return radius;
    }
    
}
