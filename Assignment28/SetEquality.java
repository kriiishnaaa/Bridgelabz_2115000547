import java.util.*;
public class SetEquality{
public static void main(String [] args){
Set<Integer> s1=new HashSet<>();
Set<Integer> s2=new HashSet<>();
s1.add(12);
s1.add(14);
s1.add(13);
s2.add(13);
s2.add(12);
s2.add(19);
System.out.println(checkEquality(s1,s2));
}
public static boolean checkEquality(Set<Integer> s1, Set<Integer> s2){
if(s1.size()!=s2.size())
return false;
for(int s:s1){
if(!s2.contains(s))
return false;
}
for(int s:s2){
if(!s1.contains(s))
return false;
}
return true;
}
}
