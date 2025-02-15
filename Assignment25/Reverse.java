import java.util.*;
public class Reverse{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String rev=reverse(s);
System.out.println(rev);
}
public static String reverse(String s){
StringBuilder sb=new StringBuilder(s);
sb.reverse();
String ans=sb.toString();
return ans;
}
}
