import java.io.*;
public class WordCounter{
public static void main(String[] args){
String file="C:/Users/hp/Desktop/Capgemini_Training/Assignment25/Lines.txt";
String targetWord="mother";
int count=0;
try (FileReader fr=new FileReader(file);
BufferedReader br=new BufferedReader(fr)){
String line;
while ((line=br.readLine())!=null){
String[] words=line.split("\\s+");
for(String word:words){
if(word.equalsIgnoreCase(targetWord)){
count++;
}
}
}
System.out.println("The word '"+targetWord+"' appears " +count+ " times.");
}catch(IOException e){
System.out.println("Error reading file: "+e.getMessage());
}
}
}
