import java.io.*;
public class ReadFirstLine{
public static void main(String[] args) {
try (BufferedReader reader=new BufferedReader(new FileReader("MultipleCatch.java"))) {
String firstLine=reader.readLine();
if (firstLine!=null) {
System.out.println(firstLine);
}else{
System.out.println("File is empty.");
}
}catch(IOException e){
System.out.println("Error reading file");
}
}
} 
