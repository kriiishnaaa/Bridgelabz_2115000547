public class Library{
public static void main(String [] args){
Author a=new Author("Runyx", "The creator of the Dark Verse series", "The Syndicator", 2024);
a.Display();
}
}
class Book{
private String title;
private int publicationYear;
public Book(String title,int publicationYear){
this.title=title;
this.publicationYear=publicationYear;
}
public void Display(){
System.out.println("Book Name: "+title);
System.out.println("Book Publication Year: "+publicationYear);
}
}
class Author extends Book{
private String name;
private String bio;
public Author(String name, String bio,String title,int publicationYear){
super(title,publicationYear);
this.name=name;
this.bio=bio;
}
public void Display(){
super.Display();
System.out.println("Author Name: "+name);
System.out.println("Author Bio: "+bio);
}
}

