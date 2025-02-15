import java.io.*;
public class BinaryFileReader{
public static void main(String[] args){
String file="C:/Users/hp/Desktop/Capgemini_Training/Assignment25/BinaryFile.txt";
try(FileInputStream fis=new FileInputStream(file);
InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
BufferedReader br=new BufferedReader(isr)){
String line;
while ((line=br.readLine())!=null){
System.out.println(line);
}
}catch (IOException e){
System.out.println("Error reading file: "+e.getMessage());
}
}
}
