import java.io.*;
public class LinePrint{
public static void main(String [] args){
String file="C:\\Users\\hp\\Desktop\\Capgemini_Training\\Assignment25\\Lines.txt";
try (FileReader fr=new FileReader(file);
BufferedReader br=new BufferedReader(fr)){
String line;
while((line=br.readLine())!=null){
System.out.println(line);
}
}catch(IOException e){
System.out.println(e.getMessage());
}
}
}
