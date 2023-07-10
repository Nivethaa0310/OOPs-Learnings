class student{ 
    String name;  // instance variables - the variables that are within class but outside the method
    int id;
}

public class objects {
    public static void main(String args[]) 
    { 
        student s1 = new student();  //  object creation
        s1.name = "Nive"; 
        s1.id = 2091; 
        System.out.println(s1.name+" "+s1.id);
    }
}
// Objects and classes in java 