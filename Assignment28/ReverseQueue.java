import java.util.*;
public class ReverseQueue{
public static void main(String [] args){
Queue<Integer> q=new LinkedList<>();
q.add(10);
q.add(50);
q.add(40);
q.add(30);
q.add(20);
q=reverse(q);
System.out.println(q);
}
public static Queue<Integer> reverse(Queue<Integer> q){
Stack<Integer> rev=new Stack<>();
while(!q.isEmpty()){
rev.push(q.remove());
}
while(!rev.isEmpty()){
q.add(rev.pop());
}
return q;
}
}
