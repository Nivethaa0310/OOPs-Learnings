class student{ 
    String name; 
    int id;  

void insert(String name, int id){
    this.name = name; 
    this.id = id;// this keyword is used when we use the same parameter name for bith the method and the class to refer them
}  
void display(){System.out.println(name+" "+id);}
}
public class Thiskey { 
    public static void main(String argss[]){ 
        student s1 = new student(); 
        s1.insert("Nive",2091); 
        s1.display(); 

    }
    
}
