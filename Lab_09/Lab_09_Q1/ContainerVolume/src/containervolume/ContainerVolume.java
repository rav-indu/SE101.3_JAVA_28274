package containervolume;

public class ContainerVolume 
{

    public static void main(String[] args) 
    {
        CylindricalContainer c1=new CylindricalContainer();
        c1.setHeight(5.0);
        c1.setRadius(2.0);
        
        double volume=c1.calVolume();
        System.out.println("Volume is: "+volume);
    }
    
}
