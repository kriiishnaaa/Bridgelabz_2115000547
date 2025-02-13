import java.util.*;
public class SortStack{
public static void main(String [] args){
Stack<Integer> s=new Stack<>();
s.push(12);
s.push(90);
s.push(78);
s.push(34);
s.push(45);
sortStack(s);
System.out.println(s);
}
public static void sortStack(Stack<Integer> s){
if(s.isEmpty())
return;
int x=s.pop();
sortStack(s);
sort(s,x);
}
public static void sort(Stack<Integer> s,int x){
if(s.isEmpty() || s.peek()<=x){
s.push(x);
return;
}
int y=s.pop();
sort(s,x);
s.push(y);
}
}

