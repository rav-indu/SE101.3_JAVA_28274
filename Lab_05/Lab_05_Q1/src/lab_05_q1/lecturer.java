package lab_05_q1;

public class lecturer extends person
{
    private String programme;

    //constructor
    public lecturer(int id, String name, String programme)
    {
        super(id, name);
        this.programme=programme;
    }

    //Getter
    public String getProgramme() {
        return programme;
    } 
}
