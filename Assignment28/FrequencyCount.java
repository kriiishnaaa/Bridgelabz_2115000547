import java.util.*;
public class FrequencyCount{
public static void main(String [] args){
List<String> ls=new ArrayList<>();
ls.add("apple");
ls.add("banana");
ls.add("orange");
ls.add("apple");
ls.add("guava");
ls.add("banana");
ls.add("orange");
ls.add("apple");
ls.add("grapes");
Frequency(ls);
}
public static void Frequency(List<String> ls){
HashMap<String,Integer> hp=new HashMap<>();
for(int i=0;i<ls.size();i++){
hp.put(ls.get(i),hp.getOrDefault(ls.get(i),0)+1);
}
System.out.println("Frequency of each String is as follows: "+hp);
}
}
