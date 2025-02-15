public class Concatenate{
public static void main(String [] args){
String s1="ghhghghhg";
String s2="kskskkskssks";
String s=concatenate(s1,s2);
System.out.println(s);
}
public static String concatenate(String s1, String s2){
StringBuffer sb=new StringBuffer(s1);
sb.append(s2);
return sb.toString();
}
}
