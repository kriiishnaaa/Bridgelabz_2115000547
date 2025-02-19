import java.util.*;
public class CheckSubset{
public static void main(String [] args){
Set<Integer> s=new HashSet<>();
s.add(10);
s.add(20);
s.add(30);
s.add(40);
s.add(60);
s.add(90);
s.add(100);
s.add(67);
Set<Integer> sub=new HashSet<>();
sub.add(10);
sub.add(90);
sub.add(40);
sub.add(101);
System.out.println(checkSubset(s,sub));
}
public static boolean checkSubset(Set<Integer> s,Set<Integer> sub){
for(int i:sub){
if(!s.contains(i))
return false;
}
return true;
}
}
