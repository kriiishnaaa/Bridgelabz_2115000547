import java.util.*;
public class QueueWithStacks{
public static void main(String [] args){
Queue q=new Queue();
q.Enqueue(12);
q.Enqueue(13);
q.Enqueue(45);
q.Dequeue();
q.Enqueue(66);
q.Enqueue(1);
q.Dequeue();
q.Enqueue(14);
q.Display();
}
}
class Queue{
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
public void Enqueue(int x){
while(!s1.isEmpty()){
s2.push(s1.pop());
}
s1.push(x);
while(!s2.isEmpty()){
s1.push(s2.pop());
}
}
public int Dequeue(){
if(s1.isEmpty())
return -1;

int x=s1.peek();
s1.pop();
return x;
}
public void Display(){
if(s1.isEmpty())
System.out.println("Queue is empty");
else
System.out.println("Queue Elements: "+s1);
}
}
