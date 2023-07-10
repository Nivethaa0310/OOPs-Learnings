class Employee{ 
    float salary; 
    String name; 
    int empid;  

   void insert(float s, String n, int i) { 
    salary = s;
    name = n;
    empid = i;
   } 
   void display(){ System.out.println(salary+" "+name+" "+empid);}
}  

public class methods { 
    public static void main(String args[]) 
    { 
        Employee e1 = new Employee(); 
        Employee e2 = new Employee(); 
        e1.insert(45000,"Nive",2091); 
        e2.insert(67000,"Niti",2020); 
        e1.display(); 
        e2.display(); 

    }
    
}
