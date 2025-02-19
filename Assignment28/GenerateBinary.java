import java.util.*;
public class GenerateBinary{
public static void main(String [] args){
int n=12;
List<String> binary=binary(n);
System.out.println(binary);
}
public static List<String> binary(int n){
List<String> ans=new ArrayList<>();
Queue<String> q=new LinkedList<>();
q.add("1");
for(int i=0;i<n;i++){
String curr=q.poll();
ans.add(curr);
q.add(curr+"0");
q.add(curr+"1");
}
return ans;
}
}
