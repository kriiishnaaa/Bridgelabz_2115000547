import java.util.*;
public class RemoveDuplicates{
public static void main(String [] args){
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(10);
l.add(40);
l.add(70);
l.add(70);
l.add(10);
l.add(100);
System.out.println("After removing duplicates: "+removeDuplicates(l));
}
public static List<Integer> removeDuplicates(List<Integer>l){
LinkedHashSet<Integer> hs=new LinkedHashSet<>();
for(int i=0;i<l.size();i++){
hs.add(l.get(i));
}
l.clear();
for(int i:hs){
l.add(i);
}
return l;
}
}
