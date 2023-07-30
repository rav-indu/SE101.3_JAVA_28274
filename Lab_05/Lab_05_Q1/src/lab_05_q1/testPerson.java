package lab_05_q1;

public class testPerson {

    public static void main(String[] args) 
    {
        student student = new student(101, "Amal", "Computer Science");

        lecturer lecturer = new lecturer(201, "Kamal", "Software Engineering");

        // Print student details
        System.out.println("Student Details:");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Course: " + student.getCourse());

        System.out.println();

        // Print lecturer details
        System.out.println("Lecturer Details:");
        System.out.println("ID: " + lecturer.id);
        System.out.println("Name: " + lecturer.name);
        System.out.println("Programme: " + lecturer.getProgramme());
    }
    
}
