import java.io.*;
public class CheckedException{
public static void main(String [] args){
try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))){
String line;
while((line=br.readLine())!=null){
System.out.println(line);
}
}catch(IOException e){
System.out.println(e.getMessage());
}
}
}
