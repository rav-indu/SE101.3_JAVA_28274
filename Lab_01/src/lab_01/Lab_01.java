package lab_01;

public class Lab_01 
{

    public static void main(String[] args) 
    {
        // Create an Item object
        Item item = new Item(1, "Gun");
        System.out.println("Item location: " + item.getLocation());
        System.out.println("Item description: " + item.getDescription());

        // Create a Monster object
        Monster monster = new Monster(2, "Yaka");
        System.out.println("Monster location: " + monster.getLocation());
        System.out.println("Monster description: " + monster.getDescription());
                
    }
    
}
