import java.util.*;
public class MergeMaps{
public static void main(String [] args){
HashMap<Character,Integer> hp1=new HashMap<>();
hp1.put('A',2);
hp1.put('B',1);
hp1.put('C',3);
hp1.put('D',2);
HashMap<Character,Integer> hp2=new HashMap<>();
hp2.put('Q',2);
hp2.put('B',1);
hp2.put('I',3);
hp2.put('L',2);
merge(hp1,hp2);
}
public static void merge(HashMap<Character, Integer> hp1, HashMap<Character, Integer> hp2){
HashMap<Character, Integer> merged=new HashMap<>();
for(char ch:hp1.keySet()){
merged.put(ch,hp1.get(ch)+hp2.getOrDefault(ch,0));
}
for(char ch:hp2.keySet()){
if(!hp1.containsKey(ch)){
merged.put(ch,hp2.get(ch));
}
}
System.out.println(merged);
}
}
