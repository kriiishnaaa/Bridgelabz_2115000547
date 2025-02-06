import java.util.*;
class Book{ 
private String name; 
private String writer; 
public Book(String name,String writer){ 
this.name=name; 
this.writer=writer; 
} 
public void displayDetails(){ 
System.out.println("Name:"+name); 
System.out.println("Writer:"+writer); 
} 
} 
class Library{ 
private ArrayList<Book> collection; 
public Library(){ 
collection=new ArrayList<>(); 
} 
public void addBook(Book b){ 
collection.add(b); 
} 
public void displayBooks(){ 
for(Book b:collection){ 
b.displayDetails(); 
System.out.println(); 
} 
} 
} 
public class LibraryDetails{ 
public static void main(String[] args){ 
Book b1=new Book("The Great Gatsby","F. Scott Fitzgerald"); 
Book b2=new Book("1984","George Orwell"); 
Library l1=new Library(); 
Library l2=new Library(); 
l1.addBook(b1); 
l2.addBook(b2); 
System.out.println("Library 1 Books:"); 
l1.displayBooks(); 
System.out.println("\nLibrary 2 Books:"); 
l2.displayBooks(); 
} 
}
