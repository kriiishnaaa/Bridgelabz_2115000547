import java.util.*;
public class UnionIntersection{
public static void main(String [] args){
Set<Integer> s1=new HashSet<>();
s1.add(10);
s1.add(20);
s1.add(30);
s1.add(40);
Set<Integer> s2=new HashSet<>();
s2.add(90);
s2.add(20);
s2.add(50);
s2.add(30);
Set<Integer> union=union(s1,s2);
Set<Integer> intersection=intersection(s1,s2);
System.out.println("Union: "+union);
System.out.println("Intersection: "+intersection);
}
public static Set<Integer> union(Set<Integer> s1,Set<Integer> s2){
Set<Integer> hs=new HashSet<>();
for(int i:s1){
hs.add(i);
}
for(int i:s2){
hs.add(i);
}
return hs;
}
public static Set<Integer> intersection(Set<Integer> s1,Set<Integer> s2){
Set<Integer> hs=new HashSet<>();
for(int i:s1){
if(s2.contains(i))
hs.add(i);
}
for(int i:s2){
if(s1.contains(i))
hs.add(i);
}
return hs;
}
}
