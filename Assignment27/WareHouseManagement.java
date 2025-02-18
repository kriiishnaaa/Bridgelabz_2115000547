import java.util.*;
public class WareHouseManagement{
public static void main(String [] args){
Storage<Electronics> es=new Storage<>();
es.addItem(new Electronics("Personal Comuputer"));
es.addItem(new Electronics("Laptop"));
es.addItem(new Electronics("Mobile Phone"));
es.addItem(new Electronics("Alexa"));
Storage<Groceries> gs=new Storage<>();
gs.addItem(new Groceries("Apples"));
gs.addItem(new Groceries("Peppers"));
gs.addItem(new Groceries("Coffee"));
gs.addItem(new Groceries("Sugar"));
Storage<Furniture> fs=new Storage<>();
fs.addItem(new Furniture("Chairs"));
fs.addItem(new Furniture("Tables"));
fs.addItem(new Furniture("Sofa"));
fs.addItem(new Furniture("Bed"));
System.out.println("Electronics: ");
WareHouse.display(es.getProducts());
System.out.println();
System.out.println("Groceries: ");
WareHouse.display(gs.getProducts());
System.out.println();
System.out.println("Furniture: ");
WareHouse.display(fs.getProducts());
}
}
abstract class WareHouseItem{
private String itemName;
public WareHouseItem(String itemName){
this.itemName=itemName;
}
public String getName(){
return itemName;
}
public String toString(){
return itemName;
}
}
class Electronics extends WareHouseItem{
public Electronics(String name){
super(name);
}
}
class Groceries extends WareHouseItem{
public Groceries(String name){
super(name);
}
}
class Furniture extends WareHouseItem{
public Furniture(String name){
super(name);
}
}
class Storage<T extends WareHouseItem> {
private List<T> products=new ArrayList<>();
public void addItem(T item){
products.add(item);
}
public T getProduct(int index){
if(index>=0 && index<products.size())
return products.get(index);
return null;
}
public List<T> getProducts(){
return products;
}
}
class WareHouse{
public static void display(List<? extends WareHouseItem> products){
for(WareHouseItem p:products){
System.out.println(p);
}
}
}
