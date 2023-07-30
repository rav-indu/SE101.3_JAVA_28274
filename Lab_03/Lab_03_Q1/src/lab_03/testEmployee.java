package lab_03;

public class testEmployee 
{

    public static void main(String[] args) 
    {
        /*
        Employee employee = new Employee();

        employee.setName("John Doe");
        employee.setAge(30);
        employee.setSalary(50000.0);
        */
        
        Employee employee = new Employee("John Doe", 30, 50000.0);

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
    
}
