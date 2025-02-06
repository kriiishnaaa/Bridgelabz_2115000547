import java.util.*;
class Course{ 
String cName; 
ArrayList<Student> sList; 
public Course(String cName){ 
this.cName=cName; 
sList=new ArrayList<>(); 
} 
public void enrollStudent(Student s){ 
sList.add(s); 
} 
public void showStudents(){ 
System.out.println("Course:"+cName); 
for(Student s:sList){ 
System.out.println(" Student:"+s.sName); 
} 
} 
} 
class Student{ 
String sName; 
ArrayList<Course> cList; 
public Student(String sName){ 
this.sName=sName; 
cList=new ArrayList<>(); 
} 
public void enrollInCourse(Course c){ 
cList.add(c); 
c.enrollStudent(this); 
} 
public void showCourses(){ 
System.out.println("Student:"+sName); 
for(Course c:cList){ 
System.out.println(" Enrolled in:"+c.cName); 
} 
} 
} 
class School{ 
String sName; 
ArrayList<Student> sList; 
public School(String sName){ 
this.sName=sName; 
sList=new ArrayList<>(); 
} 
public void addStudent(Student s){ 
sList.add(s); 
} 
public void showStudents(){ 
System.out.println("School:"+sName); 
for(Student s:sList){ 
s.showCourses(); 
} 
} 
} 
public class SchoolDetails{ 
public static void main(String[] args){ 
School s=new School("Greenwood High"); 
Student s1=new Student("Alice"); 
Student s2=new Student("Bob"); 
Course c1=new Course("Math"); 
Course c2=new Course("Science"); 
s.addStudent(s1); 
s.addStudent(s2); 
s1.enrollInCourse(c1); 
s1.enrollInCourse(c2); 
s2.enrollInCourse(c1); 
s.showStudents(); 
c1.showStudents(); 
c2.showStudents(); 
} 
}
