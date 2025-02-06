import java.util.*;
class Course{ 
String cName; 
Professor prof; 
ArrayList<Student> sList; 
public Course(String cName){ 
this.cName=cName; 
this.sList=new ArrayList<>(); 
} 
public void assignProfessor(Professor prof){ 
this.prof=prof; 
System.out.println("Professor "+prof.pName+" is assigned to course "+cName); 
} 
public void enrollStudent(Student s){ 
sList.add(s); 
System.out.println("Student "+s.sName+" enrolled in course "+cName); 
} 
public void showCourseDetails(){ 
System.out.println("Course: "+cName); 
if(prof!=null){ 
System.out.println(" Taught by: "+prof.pName); 
} 
System.out.println(" Enrolled students:"); 
for(Student s:sList){ 
System.out.println(" "+s.sName); 
} 
} 
} 
class Professor{ 
String pName; 
public Professor(String pName){ 
this.pName=pName; 
} 
} 
class Student{ 
String sName; 
public Student(String sName){ 
this.sName=sName; 
} 
public void enrollCourse(Course c){ 
c.enrollStudent(this); 
} 
} 
public class UniversityManagement{ 
public static void main(String[] args){ 
Professor p1=new Professor("Dr. Smith"); 
Professor p2=new Professor("Dr. Johnson"); 
Course c1=new Course("Computer Science"); 
Course c2=new Course("Mathematics"); 
c1.assignProfessor(p1); 
c2.assignProfessor(p2); 
Student s1=new Student("Alice"); 
Student s2=new Student("Bob"); 
s1.enrollCourse(c1); 
s2.enrollCourse(c1); 
s2.enrollCourse(c2); 
c1.showCourseDetails(); 
c2.showCourseDetails(); 
} 
}
