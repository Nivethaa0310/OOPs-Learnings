abstract class Demo{   // abstract class with abstract keyword
    abstract void display(); 
} 

public class abstractmethod extends Demo { 
    void display()  // method implementation
    { 
        System.out.println("Abstract method implementation");
    } 
    public static void main(String args[]) 
    { 
       Demo obj = new abstractmethod(); // creating object of abstract class
       obj.display(); // invoking abstract class
    }
// Abstract class shows only the output without showing the actuall output
}
