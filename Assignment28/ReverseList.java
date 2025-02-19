import java.util.*;
public class ReverseList{
public static void main(String [] args){
Reverse r=new Reverse();
System.out.println("Reversing ArrayList");
r.reverseArray();
System.out.println("Reversing LinkedList");
r.reverseLinked();
}
}
class Reverse{
static Scanner sc=new Scanner(System.in);
List<Integer> l;
public void reverseArray(){
l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
System.out.println("Before Swapping: "+l);
List<Integer> rev=new ArrayList<>();
for(int i=l.size()-1;i>=0;i--){
rev.add(l.get(i));
}
System.out.println("After swapping: "+rev);
}
public void reverseLinked(){
l=new LinkedList<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
System.out.println("Before swapping: "+l);
List<Integer> rev=new LinkedList<>();
for(int i=0;i<l.size();i++){
rev.add(((LinkedList<Integer>)l).getLast());
}
System.out.println("After swapping: "+rev);
}
}
