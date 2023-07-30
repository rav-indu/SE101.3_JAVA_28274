package lab_05_q1;

public class student extends person
{
    private String course;
    
    //constructor
    public student(int id, String name, String course)
    {
        super(id, name);
        this.course=course;
    }
    
    //Getter
    public String getCourse() {
        return course;
    }
     
}
