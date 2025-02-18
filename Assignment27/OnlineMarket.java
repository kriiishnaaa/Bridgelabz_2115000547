import java.util.*;
public class OnlineMarket{
public static void main(String [] args){

Product<Book> b1=new Product<>("Gothikana",500,new Book("fantasy"));
Product<Book> b2=new Product<>("The Hidden Hindu",250,new Book("Mythology"));
Product<Book> b3=new Product<>("The Silent Patient",400,new Book("Thriller-Suspense"));

Product<Clothes> c1=new Product<>("Salwar Suit",1000,new Clothes("Ethnic"));
Product<Clothes> c2=new Product<>("Pant Shirt",1200,new Clothes("Formals"));
Product<Clothes> c3=new Product<>("Fur Coat",3000,new Clothes("Woollen"));

Product<Gadgets> g1=new Product<>("Laptop",45000,new Gadgets("Electronic"));
Product<Gadgets> g2=new Product<>("Mobile",25000,new Gadgets("Electronic"));
Product<Gadgets> g3=new Product<>("Smart Watch",5000,new Gadgets("Electronic"));

ProductCatalog<Book> books=new ProductCatalog<>();
ProductCatalog<Clothes> clothes=new ProductCatalog<>();
ProductCatalog<Gadgets> gadgets=new ProductCatalog<>();

books.add(b1);
books.add(b2);
books.add(b3);

clothes.add(c1);
clothes.add(c2);
clothes.add(c3);

gadgets.add(g1);
gadgets.add(g2);
gadgets.add(g3);

books.Display();
gadgets.Display();
clothes.Display();
}
}
class Product<T>{
private String name;
private double price;
private T category;
public Product(String name, double price, T category){
this.name=name;
this.price=price;
this.category=category;
}
public String getName(){
return name;
}
public double getPrice(){
return price;
}
public T getCategory(){
return category;
}
public void setPrice(double price){
this.price=price;
}
public String toString(){
return name+" "+price;
}
}
class DiscountManager{
public static <T extends Product<?>> void applyDiscount(T category, double discount){
double price=category.getPrice();
double fprice=price-(price*(discount/100));
category.setPrice(fprice);
}
}
class ProductCatalog<T>{
private List<Product<T>> items=new ArrayList<>();
public void add(Product<T> item){
items.add(item);
}
public void Display(){
for(Product<T> p:items){
System.out.println(p);
}
}
}
class Book{
String genre;
public Book(String genre){
this.genre=genre;
}
}
class Clothes{
String type;
public Clothes(String type){
this.type=type;
}
}
class Gadgets{
String device;
public Gadgets(String device){
this.device=device;
}
}
