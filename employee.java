class Employee{  
    int age;  
    String name;  
    String  city;  
    void func( String n,int a, String c) {  
        name=n;  
        age=a;  
        city=c;  
    }  
    void display(){
System.out.println("The name is "+name);
System.out.println("The age is "+age);
System.out.println("The city is "+city);}  
}  
 public class employee {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
      
    e1.func("Shreyaan",22,"jaipur");  
    e2.func("Roshan",20,"jaipur");  
      
    e1.display();  
    e2.display();  
      
}  
}  
