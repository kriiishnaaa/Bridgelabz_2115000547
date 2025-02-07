public class SchoolSystem{
public static void main(String [] args){
Person p1=new Teacher("Bhumesh",24,70000);
Person p2=new Student("Jatin",21,'A');
Person p3=new Staff("Ankit",43,"Male");
p1.Display();
p1.displayRole();
System.out.println();
p2.Display();
p2.displayRole();
System.out.println();
p3.Display();
p3.displayRole();
System.out.println();
}
}
class Person{
private String name;
private int age;
public Person(String name, int age){
this.age=age;
this.name=name;
}
public void Display(){
System.out.println("My name is: "+name);
System.out.println("My age is: "+age);
}
public void displayRole(){
System.out.println("I am a person");
}
}
class Teacher extends Person{
private double salary;
public Teacher(String name, int age, double salary){
super(name,age);
this.salary=salary;
}
public void Display(){
super.Display();
System.out.println("My salary is :"+salary);
}
public void displayRole(){
System.out.println("I am a teacher");
}
}
class Student extends Person{
private char grade;
public Student(String name, int age, char grade){
super(name,age);
this.grade=grade;
}
public void Display(){
super.Display();
System.out.println("My grade is :"+grade);
}
public void displayRole(){
System.out.println("I am a student.");
}
}
class Staff extends Person{
private String gender;
public Staff(String name, int age, String gender){
super(name,age);
this.gender=gender;
}
public void Display(){
super.Display();
System.out.println("My gender is :"+gender);
}
public void displayRole(){
System.out.println("I am a staff member");
}
}
