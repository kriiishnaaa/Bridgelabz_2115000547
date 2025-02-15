import java.util.*;
public class EmployeeRecord{
}
public interface CRUD{
void Add();
void Delete(int i);
void Display();
void Update(String s);
void Update(int n);
}
class Employee{
private int ID;
private String name;
private int age;
private String dept;
private int salary;
public Employee(int ID, String name, int age, String dept, int salary){
this.name=name;
this.age=age;
this.dept=dept;
this.ID=ID;
this.salary=salary;
}
public int getID(){
return ID;
}
public int getAge(){
return age;
}
public int getSalary(){
return salary;
}
public String getName(){
return name;
}
public String getDept(){
return dept;
}
}
class EmployeeWork implements CRUD{
static HashMap<Integer, Employee> hp=new HashMap<>();
public void Add(Employee e){

}
}
