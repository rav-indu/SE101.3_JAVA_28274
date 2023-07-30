package lab_10_q1;
import java.util.Scanner;
public class Lab_10_Q1 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2=sc.nextInt();
        
        try
        {
            int div=n1/n2;
            System.out.println("Answer is: "+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by Zero");
        }
    }
    
}
