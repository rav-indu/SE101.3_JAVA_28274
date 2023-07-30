package lab_09_q2;

public class Jumpers extends Player
{

    public Jumpers(int i) {
        super(i);
    }
    public void CrouchDown()
    {
        System.out.println("Player moved down by "+(this.sp-3)+" spaces.");
    }
    
    public void CrouchUp()
    {
        System.out.println("Player moved up by "+(this.sp-3)+" spaces.");
    }
}
