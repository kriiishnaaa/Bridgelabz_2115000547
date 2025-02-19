import java.util.*;
public class ElementFromEnd{
public static void main(String [] args){
LinkedList<Character> ll=new LinkedList<>();
ll.add('A');
ll.add('B');
ll.add('C');
ll.add('R');
ll.add('Q');
ll.add('L');
ll.add('P');
int n=3;
System.out.println(EndElement(ll,n));
}
public static char EndElement(List<Character> ll,int n){
int l=ll.size();
return ll.get(ll.size()-n);
}
}
