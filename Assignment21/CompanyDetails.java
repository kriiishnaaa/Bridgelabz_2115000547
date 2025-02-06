import java.util.*;
class Company{ 
String cName; 
ArrayList<Department> deptList; 
public Company(String cName){ 
this.cName=cName; 
deptList=new ArrayList<>(); 
} 
public void addDepartment(String dName){ 
deptList.add(new Department(dName)); 
} 
public void showDetails(){ 
System.out.println("Company:"+cName); 
for(Department d:deptList){ 
d.showDetails(); 
} 
} 
public void deleteCompany(){ 
deptList.clear(); 
System.out.println("Company and all associated departments and employees deleted."); 
} 
} 
class Department{ 
String dName; 
ArrayList<Employee> empList; 
public Department(String dName){ 
this.dName=dName; 
empList=new ArrayList<>(); 
} 
public void addEmployee(String eName){ 
empList.add(new Employee(eName)); 
} 
public void showDetails(){ 
System.out.println(" Department:"+dName); 
for(Employee e:empList){ 
e.showDetails(); 
} 
} 
} 
class Employee{ 
String eName; 
public Employee(String eName){ 
this.eName=eName; 
} 
public void showDetails(){ 
System.out.println(" Employee:"+eName); 
} 
} 
public class CompanyDetails{ 
public static void main(String[] args){ 
Company c=new Company("TechCorp"); 
c.addDepartment("Engineering"); 
c.addDepartment("HR"); 
c.deptList.get(0).addEmployee("Alice"); 
c.deptList.get(0).addEmployee("Bob"); 
c.deptList.get(1).addEmployee("Charlie"); 
c.showDetails(); 
c.deleteCompany(); 
c.showDetails(); 
} 
}
