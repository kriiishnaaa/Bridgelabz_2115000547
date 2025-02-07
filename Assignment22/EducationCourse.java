public class EducationCourse{
public static void main(String [] args){
Course c=new PaidOnlineCourse("Java with Prutor","2 months","Prutor",true,5000,5.5);
c.Display();
}
}
class Course{
private String courseName;
private String courseDuration;
public Course(String courseName, String courseDuration){
this.courseName=courseName;
this.courseDuration=courseDuration;
}
public void Display(){
System.out.println("Course Name: "+courseName);
System.out.println("Course Duration: "+courseDuration);
}
}
class OnlineCourse extends Course{
private String platform;
private boolean isRecorded;
public OnlineCourse(String courseName, String courseDuration,String platform, boolean isRecorded){
super(courseName,courseDuration);
this.isRecorded=isRecorded;
this.platform=platform;
}
public void Display(){
super.Display();
System.out.println("Course Platform: "+platform);
System.out.println("Are the classes being recorded: "+isRecorded);
}
}
class PaidOnlineCourse extends OnlineCourse{
private int fee;
private double discount;
public PaidOnlineCourse(String courseName, String courseDuration,String platform, boolean isRecorded,int fee, double discount){
super(courseName,courseDuration,platform,isRecorded);
this.fee=fee;
this.discount=discount;
}
public void Display(){
super.Display();
System.out.println("Course Fee: "+fee);
System.out.println("Discount: "+discount);
}
}

