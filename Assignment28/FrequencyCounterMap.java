import java.io.*;
import java.util.*;
class FrequencyCounterMap{
public static void main(String[] args) throws IOException{
BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
Map<String, Integer> wordCount = new HashMap<>();
String line;
while ((line = reader.readLine()) != null) {
line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
String[] words = line.split("\\s+");
for (String word : words) {
if (!word.isEmpty()) {
wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}
}
}
reader.close();
for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
