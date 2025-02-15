import java.util.*;
public class Distinct{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String dis=remove(s);
System.out.println(dis);
}
public static String remove(String s){
StringBuilder sb=new StringBuilder();
HashSet<Character> h=new HashSet<>();
for(int i=0;i<s.length();i++){
if(!h.contains(s.charAt(i))){
h.add(s.charAt(i));
sb.append(s.charAt(i));
}
}
return sb.toString();
}
}
