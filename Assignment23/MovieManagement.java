public class MovieManagement{
public static void main(String[] args){
MovieList movieList = new MovieList();
movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
movieList.addMovieAtEnd("Titanic", "James Cameron", 1997, 7.8);
movieList.displayMoviesForward();
movieList.updateRating("Titanic", 8.0);
movieList.displayMoviesReverse();
}
}
interface Updatable {
void updateRating(double newRating);
}
class Movie {
String title;
String director;
int year;
double rating;
Movie next, prev;
public Movie(String title, String director, int year, double rating) {
this.title=title;
this.director=director;
this.year=year;
this.rating=rating;
this.next=this.prev=null;
}
}
class MovieList{
private Movie head, tail;
public void addMovieAtBeginning(String title, String director, int year, double rating){
Movie newMovie=new Movie(title, director, year, rating);
if (head==null){
head=tail=newMovie;
return;
}
newMovie.next=head;
head.prev=newMovie;
head=newMovie;
}
public void addMovieAtEnd(String title, String director, int year, double rating){
Movie newMovie=new Movie(title, director, year, rating);
if(head==null){
head=tail=newMovie;
return;
}
tail.next=newMovie;
newMovie.prev=tail;
tail=newMovie;
}
public void addMovieAtPosition(String title, String director, int year, double rating, int position){
Movie newMovie=new Movie(title, director, year, rating);
if (position==1){
addMovieAtBeginning(title, director, year, rating);
return;
}
Movie temp = head;
for(int i=1;temp!=null && i<position-1;i++) 
temp= temp.next;
if(temp==null || temp.next==null) {
addMovieAtEnd(title, director, year, rating);
return;
}
newMovie.next=temp.next;
newMovie.prev=temp;
temp.next.prev=newMovie;
temp.next=newMovie;
}
public void removeMovie(String title){
Movie temp=head;
while(temp!=null && !temp.title.equals(title)) 
temp=temp.next;
if(temp==null) return;
if(temp==head) head=head.next;
if(temp==tail) tail=tail.prev;
if(temp.prev!=null) temp.prev.next=temp.next;
if (temp.next!=null) temp.next.prev=temp.prev;
}
public void searchMovie(String director){
Movie temp=head;
while (temp!=null) {
if(temp.director.equals(director)) System.out.println(temp.title + " directed by " + temp.director);
temp=temp.next;
}
}
public void searchMovie(double rating) {
Movie temp=head;
while (temp!=null) {
if (temp.rating==rating) System.out.println(temp.title+" with rating "+temp.rating);
temp=temp.next;
}
}
public void updateRating(String title, double newRating){
Movie temp=head;
while(temp!=null){
if(temp.title.equals(title)) {
temp.rating=newRating;
return;
}
temp=temp.next;
}
}
public void displayMoviesForward() {
Movie temp=head;
while(temp!=null) {
System.out.println(temp.title+" directed by "+temp.director+" ("+temp.year+") Rating: "+temp.rating);
temp=temp.next;
}
}
public void displayMoviesReverse() {
Movie temp = tail;
while (temp != null) {
System.out.println(temp.title + " directed by " + temp.director + " (" + temp.year + ") Rating: " + temp.rating);
temp = temp.prev;
}
}
}

