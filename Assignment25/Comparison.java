import java.io.*;
public class Comparison {
public static void main(String[] args) {
compareStringConcatenation();
countWordsInFile("C:/Users/hp/Desktop/Capgemini_Training/Assignment25/BinaryFile.txt");
}
public static void compareStringConcatenation(){
String text="hello";
int iterations=1000000;
long startTime=System.nanoTime();
StringBuilder sb=new StringBuilder();
for(int i=0;i<iterations;i++) {
sb.append(text);
}
long endTime=System.nanoTime();
System.out.println("StringBuilder time: "+(endTime-startTime)/1_000_000+" ms");
startTime=System.nanoTime();
StringBuffer sbf=new StringBuffer();
for (int i=0;i<iterations;i++){
sbf.append(text);
}
endTime=System.nanoTime();
System.out.println("StringBuffer time: "+(endTime-startTime)/1_000_000+" ms");
}
public static void countWordsInFile(String filePath){
long startTime=System.nanoTime();
int wordCount=0;
try(FileInputStream fis=new FileInputStream(filePath);
InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
BufferedReader br=new BufferedReader(isr)){
String line;
while ((line=br.readLine())!=null){
wordCount+=line.split("\\s+").length;
}
}catch(IOException e){
System.out.println("Error reading file: "+e.getMessage());
}
long endTime=System.nanoTime();
System.out.println("Total words in file: "+wordCount);
System.out.println("File read time: "+(endTime-startTime)/1_000_000+" ms");
}
}
