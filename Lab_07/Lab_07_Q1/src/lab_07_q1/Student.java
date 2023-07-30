package lab_07_q1;

final class Student 
{
    final int marks=100;
    final void display(){
        System.out.println("marks="+marks);
    }
}

//in a final variable we should initialize a value when declaration (if a variable is final, we can't change the value)
//final method can't be overridden by subclasses.
