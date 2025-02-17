import java.io.*;
import java.nio.file.*;
public class FileAndInputStreamComparison{
public static void main(String[] args){
String filePath1MB="C:\\Users\\hp\\Desktop\\Capgemini_Training\\Assignment26\\1MB.txt";
String filePath100MB="C:\\Users\\hp\\Desktop\\Capgemini_Training\\Assignment26\\100MB.txt";
String filePath500MB="C:\\Users\\hp\\Desktop\\Capgemini_Training\\Assignment26\\500MB.txt";
testFileReader(filePath1MB);
testInputStreamReader(filePath1MB);
testFileReader(filePath100MB);
testInputStreamReader(filePath100MB);
testFileReader(filePath500MB);
testInputStreamReader(filePath500MB);
}
public static void testFileReader(String filePath){
long startTime = System.nanoTime();
try (FileReader fileReader = new FileReader(filePath)){
int ch;
while ((ch = fileReader.read()) != -1) {}
} catch (IOException e) {
e.printStackTrace();
}
long endTime = System.nanoTime();
long duration = endTime - startTime;
System.out.println("FileReader Time for " + filePath + ": " + (duration / 1_000_000) + " ms");
}
public static void testInputStreamReader(String filePath){
long startTime = System.nanoTime();
try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))){
int ch;
while ((ch = inputStreamReader.read()) != -1) {}
} catch (IOException e) {
e.printStackTrace();
}
long endTime = System.nanoTime();
long duration = endTime - startTime;
System.out.println("InputStreamReader Time for " + filePath + ": " + (duration / 1_000_000) + " ms");
}
}
