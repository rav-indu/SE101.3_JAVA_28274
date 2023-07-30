package lab_10_q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_10_Q3 {

    public static void main(String[] args) 
    {
        try{
            File file=new File("nonexistant.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Error. File not found");
        }
        
        
    }
    
}
