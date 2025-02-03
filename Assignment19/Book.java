import java.util.*;
public class Book{
static String libraryName="Raza Library";
private String title;
private String author;
final private String isbn;
public Book(String title, String author, String isbn){
this.title=title;
this.author=author;
this.isbn=isbn;
}
static void displayLibraryname(){
System.out.println("Library Name: "+libraryName);
}
public void Display(){
System.out.println("Book title: "+title);
System.out.println("Author Name: "+author);
System.out.println("Unique Identifier of book: "+isbn);
}
public static void main(String [] args){
Book b=new Book("It ends with us","Colleen Hoover","AO0011");
System.out.println(b instanceof Book);
b.displayLibraryname();
b.Display();
}
}

