class student{ 
    String name;
    int id; 
    int age;

student(String n1,int i1) // same method with the same parameters data types but with different argument size leads to overloading

{ 
    name = n1; 
    id = i1;
} 

student(String n1,int i1,int a) 
{ 
    name = n1;
    id = i1;
    age = a;
} 
void display(){System.out.println(name+" "+id+" "+age);}
}

public class overloading { 
    public static void main(String args[])
    { 
        student s1 = new student("Nive",2091); 
        student s2 = new student("Nive",2091,20); 
        s1.display(); 
        s2.display();
    }
    
}
