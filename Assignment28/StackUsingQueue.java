import java.util.*;
public class StackUsingQueue{
public static void main(String [] args){
StackUsingQueue sq=new StackUsingQueue();
sq.push(10);
sq.push(40);
sq.push(70);
sq.push(89);
System.out.println(sq.pop());
System.out.println(sq.top());
System.out.println(sq.isEmpty());
}
Queue<Integer> q1=new LinkedList<>();
Queue<Integer> q2=new LinkedList<>();
public void push(int x){
q2.add(x);
while(!q1.isEmpty()){
q2.add(q1.poll());
}
Queue<Integer> temp=q1;
q1=q2;q2=temp;
}
public int pop(){
if(!q1.isEmpty()){
System.out.println("Stack is Empty");
return -1;
}
return q1.peek();
}
public int top(){
return q1.peek();
}
public boolean isEmpty(){
return q1.isEmpty();
}
}
