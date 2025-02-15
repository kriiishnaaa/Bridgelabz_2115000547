import java.util.*;
public class WordSearch{
public static void main(String [] args){
String [] sentences=new String[5];
String word="Hi!";
sentences[0]="Name is Krishna";
sentences[1]="HP is product of laptop I use";
sentences[2]="Hey! Don't mispronounce my name";
sentences[3]="Its my training happening in capgemini";
sentences[4]="Hey! How are you";
System.out.println(search(sentences,word));
}
public static String search(String [] sentences, String word){
for(int i=0;i<sentences.length;i++){
String [] words=sentences[i].split(" ");
for(int j=0;j<words.length;j++){
if(words[j].equals(word))
return sentences[i];
}
}
return "Not Found";
}
}
