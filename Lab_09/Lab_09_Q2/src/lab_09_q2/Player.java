package lab_09_q2;

public class Player extends Movements
{
    int sp;
    
    Player(int i){
        this.sp=i;
    }
    
    @Override
    public void Up(){
        System.out.println("Player moved up by "+this.sp+" spaces.");
    }
    
    @Override
    public void Down(){
        System.out.println("Player moved down by "+this.sp+" spaces.");
    }
    
    @Override
    public void Right(){
        System.out.println("Player moved right by "+this.sp+" spaces.");
    }
    
    @Override
    public void Left(){
        System.out.println("Player moved left by "+this.sp+" spaces.");
    }
    
}
