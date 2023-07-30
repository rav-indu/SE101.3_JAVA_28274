package containervolume;

public class CylindricalContainer extends Container
{
    @Override
    public double calVolume()
    {
        double volume=Math.PI*getRadius()*getRadius()*getHeight();
        return volume;
    }
}
