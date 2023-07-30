package lab_04;

public class testEmployee {

    public static void main(String[] args) 
    {
        Employee Bogdan = new Employee();
        Employee Bird = new Employee();
        
        // Set values for Bogdan using setters
        Bogdan.setEmpID(1001);
        Bogdan.setEmpName("Bogdan");
        Bogdan.setEmpDesignation("Manager");

        // Set values for Bird using setters
        Bird.setEmpID(1002);
        Bird.setEmpName("Bird");
        Bird.setEmpDesignation("Engineer");

        // Print details using getters
        System.out.println("ID: " + Bogdan.getEmpID());
        System.out.println("Name: " + Bogdan.getEmpName());
        System.out.println("Designation: " + Bogdan.getEmpDesignation());

        System.out.println("ID: " + Bird.getEmpID());
        System.out.println("Name: " + Bird.getEmpName());
        System.out.println("Designation: " + Bird.getEmpDesignation());
    }
    
}
