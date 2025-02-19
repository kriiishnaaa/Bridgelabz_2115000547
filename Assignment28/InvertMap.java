import java.util.*;
public class InvertMap{
public static void main(String [] args){
HashMap<Character,Integer> hp=new HashMap<>();
hp.put('A',2);
hp.put('B',1);
hp.put('C',3);
hp.put('D',2);
invertMap(hp);
}
public static void invertMap(HashMap<Character, Integer> hp){
HashMap<Integer,List<Character>> invert=new HashMap<>();
for(char ch:hp.keySet()){
int value=hp.get(ch);
if(!invert.containsKey(value))
invert.put(value,new ArrayList<>());
invert.get(value).add(ch);
}
System.out.println(invert);
}
}
