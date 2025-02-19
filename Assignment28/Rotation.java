import java.util.*;
public class Rotation{
public static void main(String [] args){
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
l.add(50);
System.out.println(rotate(l,2));
}
public static List<Integer> rotate(List<Integer> l, int position){
int [] temp=new int[l.size()];
List<Integer> rot=new ArrayList<>(l.size());
for(int i=0;i<l.size();i++){
temp[(i+position)%l.size()]=l.get(i);
}
for(int i=0;i<l.size();i++){
rot.add(temp[i]);
}
return rot;
}
}
