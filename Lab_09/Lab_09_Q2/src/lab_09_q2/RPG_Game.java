package lab_09_q2;

public class RPG_Game {

    public static void main(String[] args) 
    {
        Player p1 = new Player(2);
        {
            p1.Up();
            p1.Down();
            p1.Left();
            p1.Right();
        }
        
        Jumpers j1 = new Jumpers(5);
        {
            j1.Up();
            j1.Down();
            j1.Left();
            j1.Right();
        }
        
        Opposites o1 = new Opposites(1);
        {
            o1.Up();
            o1.Down();
            o1.Left();
            o1.Right();
        }
    }
    
}
