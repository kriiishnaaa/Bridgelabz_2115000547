import java.util.*;
public class BookDetails{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
Book b=new Book();
System.out.println("Enter the book author");
b.author=sc.nextLine();
System.out.println("Enter the book title");
b.title=sc.nextLine();
System.out.println("Enter the book price");
b.price=sc.nextInt();
b.displayDetails();
}
}

class Book{
String title;
int price;
String author;
public void displayDetails(){
System.out.println("Book Author: "+author);
System.out.println("Book Title: "+title);
System.out.println("Book Price: "+price);
}
}
