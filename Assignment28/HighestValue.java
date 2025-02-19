import java.util.*;
public class HighestValue{
public static void main(String [] args){
HashMap<Character,Integer> hp=new HashMap<>();
hp.put('A',2);
hp.put('B',1);
hp.put('C',3);
hp.put('D',2);
highestValue(hp);
}
public static void highestValue(HashMap<Character, Integer> hp){
int max=Integer.MIN_VALUE;
char ans='a';
for(char ch:hp.keySet()){
if(hp.get(ch)>max){
max=hp.get(ch);
ans=ch;
}
}
System.out.println(ans);
}
}
