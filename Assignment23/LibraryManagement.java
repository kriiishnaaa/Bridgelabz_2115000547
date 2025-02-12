public class LibraryManagement {
public static void main(String[] args) {
LibraryManager manager = new LibraryManager();
manager.addBookAtEnd("1984", "George Orwell", "Dystopian", 1001, true);
manager.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 1002, true);
manager.displayBooksForward();
System.out.println("Total Books: " + manager.countBooks());
}
}
class Book {
String title;
String author;
String genre;
int bookId;
boolean isAvailable;
Book prev, next;
public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
this.title = title;
this.author = author;
this.genre = genre;
this.bookId = bookId;
this.isAvailable = isAvailable;
this.prev = null;
this.next = null;
}
}
class LibraryManager {
private Book head = null;
private Book tail = null;
private int count = 0;
public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
Book newBook = new Book(title, author, genre, bookId, isAvailable);
if (head == null) {
head = tail = newBook;
} else {
newBook.next = head;
head.prev = newBook;
head = newBook;
}
count++;
}
public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
Book newBook = new Book(title, author, genre, bookId, isAvailable);
if (head == null) {
head = tail = newBook;
} else {
tail.next = newBook;
newBook.prev = tail;
tail = newBook;
}
count++;
}
public void removeBook(int bookId) {
Book temp = head;
while (temp != null && temp.bookId != bookId) temp = temp.next;
if (temp == null) return;
if (temp == head) head = head.next;
if (temp == tail) tail = tail.prev;
if (temp.prev != null) temp.prev.next = temp.next;
if (temp.next != null) temp.next.prev = temp.prev;
count--;
}
public void searchBook(String query) {
Book temp = head;
while (temp != null) {
if (temp.title.equalsIgnoreCase(query) || temp.author.equalsIgnoreCase(query)) {
System.out.println(temp.title + " by " + temp.author + " (ID: " + temp.bookId + ", Genre: " + temp.genre + ", Available: " + temp.isAvailable + ")");
return;
}
temp = temp.next;
}
}
public void updateAvailability(int bookId, boolean status) {
Book temp = head;
while (temp != null) {
if (temp.bookId == bookId) {
temp.isAvailable = status;
return;
}
temp = temp.next;
}
public void displayBooksForward() {
Book temp = head;
while (temp != null) {
System.out.println(temp.title + " by " + temp.author + " (ID: " + temp.bookId + ", Genre: " + temp.genre + ", Available: " + temp.isAvailable + ")");
temp = temp.next;
}
}
public void displayBooksReverse() {
Book temp = tail;
while (temp != null) {
System.out.println(temp.title + " by " + temp.author + " (ID: " + temp.bookId + ", Genre: " + temp.genre + ", Available: " + temp.isAvailable + ")");
temp = temp.prev;
}
}
public int countBooks() {
return count;
}
}
