import java.util.*;
class Employee{
String name="";
int salary=0;
String id="";
public Employee(String id, String name, int salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
public void displayDetails(){
System.out.println("Employee id: "+id);
System.out.println("Employee name: "+name);
System.out.println("Employee salary: "+salary);
}
public static void main(String [] args){
Employee e=new Employee("1234","Krishna",1200000);
e.displayDetails();
}
}
