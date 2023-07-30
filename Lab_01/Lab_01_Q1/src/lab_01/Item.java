package lab_01;

public class Item 
{
    //protected instance variables
    private int location;
    private String description;
    
    //constructor
    protected Item(int location, String description)
    {
        this.location=location;
        this.description=description;;
    }
    
    //Getter and Setter methods for location
    public int getLocation()
    {
        return location;
    }
    
    public void setLocation(int location)
    {
        this.location=location;
    }
    
    //Getter and Setter methods for description
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description=description;
    }
}
