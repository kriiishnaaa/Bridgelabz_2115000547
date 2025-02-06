import java.util.*;
class University{ 
String uName; 
ArrayList<Department> deptList; 
public University(String uName){ 
this.uName=uName; 
deptList=new ArrayList<>(); 
} 
public void addDepartment(String dName){ 
deptList.add(new Department(dName)); 
} 
public void showDetails(){ 
System.out.println("University:"+uName); 
for(Department d:deptList){ 
d.showDetails(); 
} 
} 
public void deleteUniversity(){ 
deptList.clear(); 
System.out.println("University and all associated departments deleted."); 
} 
} 
class Department{ 
String dName; 
ArrayList<Faculty> fList; 
public Department(String dName){ 
this.dName=dName; 
fList=new ArrayList<>(); 
} 
public void addFaculty(Faculty f){ 
fList.add(f); 
} 
public void showDetails(){ 
System.out.println(" Department:"+dName); 
for(Faculty f:fList){ 
f.showDetails(); 
} 
} 
} 
class Faculty{ 
String fName; 
public Faculty(String fName){ 
this.fName=fName; 
} 
public void showDetails(){ 
System.out.println(" Faculty:"+fName); 
} 
} 
public class UniversityDetails{ 
public static void main(String[] args){ 
University u=new University("Tech University"); 
u.addDepartment("Computer Science"); 
u.addDepartment("Electrical Engineering"); 
Department d1=u.deptList.get(0); 
Department d2=u.deptList.get(1); 
Faculty f1=new Faculty("Dr. Smith"); 
Faculty f2=new Faculty("Dr. Johnson"); 
Faculty f3=new Faculty("Dr. Lee"); 
d1.addFaculty(f1); 
d2.addFaculty(f2); 
d2.addFaculty(f3); 
u.showDetails(); 
u.deleteUniversity(); 
u.showDetails(); 
} 
}
