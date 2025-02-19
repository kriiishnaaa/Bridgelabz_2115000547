import java.util.*;
public class SetToList{
public static void main(String [] args){
Set<Integer> s1=new HashSet<>();
s1.add(10);
s1.add(20);
s1.add(30);
s1.add(40);
s1.add(60);
s1.add(90);
s1.add(100);
s1.add(67);
List<Integer> l=setToSort(s1);
System.out.println(l);
}
public static List<Integer> setToSort(Set<Integer> s){
return new ArrayList<>(new TreeSet<>(s));
}
}
