import java.util.regex.*;
public class DateExtractor {
public static void main(String[] args) {
String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
Pattern pattern = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
Matcher matcher = pattern.matcher(text);
System.out.println("Extracted dates:");
while (matcher.find()) System.out.print(matcher.group() + ", ");
}
}
