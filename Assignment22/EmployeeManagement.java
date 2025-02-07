class Employee{ 
String eName; 
int eId; 
int eSalary; 
public Employee(String eName,int eId,int eSalary){ 
this.eName=eName; 
this.eId=eId; 
this.eSalary=eSalary; 
} 
public void displayDetails(){ 
System.out.println("Employee's Name: "+eName); 
System.out.println("Employee's ID: "+eId); 
System.out.println("Employee's Salary: "+eSalary); 
} 
} 
class Manager extends Employee{ 
int tSize; 
public Manager(String eName,int eId,int eSalary,int tSize){ 
super(eName,eId,eSalary); 
this.tSize=tSize; 
} 
public void displayDetails(){ 
super.displayDetails(); 
System.out.println("Team Size = "+tSize); 
} 
} 
class Developer extends Employee{ 
String pLang; 
public Developer(String eName,int eId,int eSalary,String pLang){ 
super(eName,eId,eSalary); 
this.pLang=pLang; 
} 
public void displayDetails(){ 
super.displayDetails(); 
System.out.println("Programming Language = "+pLang); 
} 
} 
class Intern extends Employee{ 
int dMonths; 
public Intern(String eName,int eId,int eSalary,int dMonths){ 
super(eName,eId,eSalary); 
this.dMonths=dMonths; 
} 
public void displayDetails(){ 
super.displayDetails(); 
System.out.println("Duration: "+dMonths+" months"); 
} 
} 
public class EmployeeManagement{ 
public static void main(String[] args){ 
Employee e1=new Manager("Khushi",1,100000,5); 
Employee e2=new Developer("Krishna",2,70000,"Java"); 
Employee e3=new Intern("Baibhavi",3,10000,6); 
e1.displayDetails(); 
System.out.println(); 
e2.displayDetails(); 
System.out.println(); 
e3.displayDetails(); 
} 
}
