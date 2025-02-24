import java.lang.annotation.*; 
import java.lang.reflect.*; 
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE) 
@interface Author { String name(); } 
@Author(name = "John Doe") 
public class AuthorAnnotationReader { 
public static void main(String[] args) { 
Class<Book> obj = Book.class; 
if (obj.isAnnotationPresent(Author.class)) { 
Author author = obj.getAnnotation(Author.class); 
System.out.println("Author: " + author.name()); 
} 
} 
}
class Book {} 
