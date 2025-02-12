import java.util.*;
public class StudentRecord{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
StudentManagement sm=new StudentManagement();
sm.AddAtBeginning(2115000547,"Krishna",23,"Outstanding");
sm.AddAtEnd(2115000789,"Palak",22,"A+");
sm.AddAtPosition(2115000987,"Sahil",22,"A",2);
sm.displayStudents();
sm.DeleteStudent(2115000987);
sm.searchStudent(2115000547);
sm.searchStudent(2115000345);
sm.updateGrade(2115000789,"A");
sm.displayStudents();
}
}
class Student{
int rollNumber;
int age;
String name;
String grade;
Student next;
public Student(int rollNumber, int age, String name, String grade){
this.age=age;
this.rollNumber=rollNumber;
this.name=name;
this.grade=grade;
}
public Student(int rollNumber, int age, String name, String grade, Student next){
this.age=age;
this.rollNumber=rollNumber;
this.name=name;
this.grade=grade;
this.next=next;
}
}
class StudentManagement{
private Student head;
public void AddAtBeginning(int rollNumber, String name, int age, String grade){
Student newStudent=new Student(rollNumber,age,name,grade);
newStudent.next=head;
head=newStudent;
}
public void AddAtEnd(int rollNumber, String name, int age, String grade){
Student newStudent=new Student(rollNumber,age,name,grade);
if(head==null){
head=newStudent;
return;
}
Student temp=head;
while(temp.next!=null){
temp=temp.next;
}
temp.next=newStudent;
}
public void AddAtPosition(int rollNumber, String name, int age, String grade, int position){
Student newStudent=new Student(rollNumber,age,name,grade);
if(position==1){
newStudent.next=head;
head=newStudent;
return;
}
Student temp=head;
for(int i=1;temp!=null && i<position-1;i++){
temp=temp.next;
}
if(temp==null){
System.out.println("Position out of range");
return;
}
newStudent.next=temp.next;
temp.next=newStudent;
}
public void DeleteStudent(int rollNumber){
if(head==null){
System.out.println("List is empty");
return;
}
if(head.rollNumber==rollNumber){
head=head.next;
return;
}
Student temp=head;
while (temp.next!=null && temp.next.rollNumber!=rollNumber) {
temp=temp.next;
}
if(temp.next==null){
System.out.println("Student not found.");
return;
}
temp.next=temp.next.next;
}
public void searchStudent(int rollNumber){
Student temp=head;
while (temp!=null) {
if (temp.rollNumber==rollNumber) {
System.out.println("Student Found: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
return;
}
temp=temp.next;
}
System.out.println("Student not found.");
}
public void updateGrade(int rollNumber, String newGrade){
Student temp=head;
while(temp!=null){
if (temp.rollNumber==rollNumber) {
temp.grade=newGrade;
System.out.println("Grade updated successfully.");
return;
}
temp=temp.next;
}
System.out.println("Student not found.");
}
public void displayStudents(){
if(head==null) {
System.out.println("No student records available.");
return;
}
Student temp = head;
while (temp != null) {
System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
temp = temp.next;
}
}
}

