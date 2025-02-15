import java.io.*;
public class ConsoleToFile{
public static void main(String[] args){
String file="C:/Users/hp/Desktop/Capgemini_Training/Assignment25/Lines.txt";
try(InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
FileWriter fw=new FileWriter(file, true);
BufferedWriter bw=new BufferedWriter(fw)){
String line;
System.out.println("Enter text (type 'exit' to stop):");
while (!(line = br.readLine()).equalsIgnoreCase("exit")){
bw.write(line);
bw.newLine();
}
System.out.println("Input saved to file.");
}catch(IOException e){
System.out.println("Error writing to file: "+e.getMessage());
}
}
}
