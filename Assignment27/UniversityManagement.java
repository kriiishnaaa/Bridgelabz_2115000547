import java.util.*;
public class UniversityManagement{
public static void main(String [] args){
ExamType e=new ExamType();
AssignmentType a=new AssignmentType();
ResearchType r=new ResearchType();
Course<ExamType> language = new Course<>("Literature", "English", e);
Course<AssignmentType> java = new Course<>("Coding", "Computer Science", a);
Course<ResearchType> physics = new Course<>("Quantum Physics", "Science", r);
CourseCatalog cc=new CourseCatalog();
cc.addCourse(language);
cc.addCourse(java);
cc.addCourse(physics);
cc.Display();
}
}
public class CourseType{
private String type;
public CourseType(String type){
this.type=type;
}
public String getType(){
return type;
}
public void setName(String type){
this.type=type;
}
public String toString(){
return type;
}
}
class ExamType extends CourseType{
public ExamType(){super("Exam-Type Course");}
}
class AssignmentType extends CourseType{
public AssignmentType(){super("Assignment-Based Course");}
}
class ResearchType extends CourseType{
public ResearchType(){super("Research-Based Course");}
}
class Course<T extends CourseType>{
private String courseName;
private String dept;
private T courseType;
public Course(String courseName, String dept, T courseType){
this.courseName=courseName;
this.dept=dept;
this.courseType=courseType;
}
public String getCourseName(){
return courseName;
}
public T getCourseType(){
return courseType;
}
public String getDept(){
return dept;
}
}
class CourseCatalog{
private List<Course<? extends CourseType>> courses=new ArrayList<>();
public void addCourse(Course<? extends CourseType> course){
courses.add(course);
}
public void Display(){
System.out.println("University Course Catalog:");
for(Course<? extends CourseType> course:courses){
System.out.println(course);
}
}
}
