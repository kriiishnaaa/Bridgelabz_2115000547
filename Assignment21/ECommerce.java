import java.util.*;
class Product{ 
String pName; 
double pPrice; 
public Product(String pName,double pPrice){ 
this.pName=pName; 
this.pPrice=pPrice; 
} 
public void showDetails(){ 
System.out.println(" Product:"+pName+" - Price:$"+pPrice); 
} 
} 
class Order{ 
String oID; 
ArrayList<Product> pList; 
public Order(String oID){ 
this.oID=oID; 
this.pList=new ArrayList<>(); 
} 
public void addProduct(Product p){ 
pList.add(p); 
} 
public void showOrderDetails(){ 
System.out.println("Order ID:"+oID); 
double tAmount=0; 
for(Product p:pList){ 
p.showDetails(); 
tAmount+=p.pPrice; 
} 
System.out.println("Total Amount:$"+tAmount); 
} 
} 
class Customer{ 
String cName; 
ArrayList<Order> oList; 
public Customer(String cName){ 
this.cName=cName; 
this.oList=new ArrayList<>(); 
} 
public void placeOrder(Order o){ 
oList.add(o); 
} 
public void showCustomerDetails(){ 
System.out.println("Customer:"+cName); 
for(Order o:oList){ 
o.showOrderDetails(); 
} 
} 
} 
public class ECommerce{ 
public static void main(String[] args){ 
Customer c=new Customer("John Doe"); 
Product p1=new Product("Laptop",1200.00); 
Product p2=new Product("Smartphone",800.00); 
Product p3=new Product("Headphones",150.00); 
Order o1=new Order("ORD001"); 
o1.addProduct(p1); 
o1.addProduct(p2); 
Order o2=new Order("ORD002"); 
o2.addProduct(p3); 
c.placeOrder(o1); 
c.placeOrder(o2); 
c.showCustomerDetails(); 
} 
}
