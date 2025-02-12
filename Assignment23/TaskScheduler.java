public class TaskScheduler{
public static void main(String[]args){
TaskManager tm=new TaskManager();
tm.addTaskAtEnd(1,"Submit Report",2,"2025-02-15");
tm.addTaskAtEnd(2,"Prepare Presentation",1,"2025-02-20");
tm.displayTasks();
tm.viewCurrentTask();
tm.searchByPriority(1);
tm.removeTask(1);
tm.displayTasks();
}
}
class Task {
int taskId;
String taskName;
int priority;
String dueDate;
Task next;
public Task(int taskId,String taskName,int priority,String dueDate){
this.taskId=taskId;
this.taskName=taskName;
this.priority=priority;
dueDate=dueDate;
this.next=null;
}
}
class TaskManager{
private Task head=null;
private Task currentTask=null;
public void addTaskAtBeginning(int taskId,String taskName,int priority,String dueDate){
Task newTask=new Task(taskId,taskName,priority,dueDate);
if(head==null){
head=newTask;
head.next=head;
currentTask=head;
}
else{
Task temp=head;
while(temp.next!=head)temp=temp.next;
newTask.next=head;
temp.next=newTask;
head=newTask;
}
}
public void addTaskAtEnd(int taskId,String taskName,int priority,String dueDate){
Task newTask=new Task(taskId,taskName,priority,dueDate);
if(head==null){
head=newTask;
head.next=head;
currentTask=head;
}
else{
Task temp=head;
while(temp.next!=head)temp=temp.next;
temp.next=newTask;
newTask.next=head;
}
}
public void removeTask(int taskId){
if(head==null)return;
Task temp=head,prev=null;
if(head.taskId==taskId&&head.next==head){
head=null;
currentTask=null;
return;
}
while(temp.taskId!=taskId&&temp.next!=head){
prev=temp;
temp=temp.next;
}
if(temp.taskId==taskId){
if(temp==head){
Task last=head;
while(last.next!=head)last=last.next;
head=head.next;
last.next=head;
}
else{
prev.next=temp.next;
}
if(currentTask==temp)currentTask=head;
}
}
public void viewCurrentTask(){
if(currentTask!=null){
System.out.println("Current Task: "+currentTask.taskName+" (Priority: "+currentTask.priority+", Due: "+currentTask.dueDate+")");
currentTask=currentTask.next;
}
}
public void displayTasks(){
if(head==null)return;
Task temp=head;
do{
System.out.println(temp.taskName+" (ID: "+temp.taskId+", Priority: "+temp.priority+", Due: "+temp.dueDate+")");
temp=temp.next;
}while(temp!=head);
}
public void searchByPriority(int priority){
if(head==null)return;
Task temp=head;
do{
if(temp.priority==priority)System.out.println(temp.taskName+" (ID: "+temp.taskId+")");
temp=temp.next;
}while(temp!=head);
}
}

