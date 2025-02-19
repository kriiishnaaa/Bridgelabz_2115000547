import java.util.*;
public class Difference{
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
Set<Integer> diff=difference(s1,s2);
System.out.println(difference(s1,s2));
}
public static Set<Integer> difference(Set<Integer> s1,Set<Integer> s2){
HashSet<Integer> hs=new HashSet<>();
for(int i:s1){
if(!s2.contains(i))
hs.add(i);
}
for(int i:s2){
if(!s1.contains(i))
hs.add(i);
}
return hs;
}
}
