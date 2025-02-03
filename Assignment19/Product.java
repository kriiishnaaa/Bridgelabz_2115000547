public class Product{
static int discount=10;
private String productName;
private int price;
private int quantity;
final private String productId="SL00111";
public Product(String productName, int price, int quantity){
this.productName=productName;
this.price=price;
this.quantity=quantity;
}
static int updateDiscount(int d){
discount=d;
return discount;
}
public void Display(){
System.out.println("Product Name: "+productName);
System.out.println("Product id: "+productId);
System.out.println("Product Quantity: "+quantity);
}
public static void main(String [] args){
Product p=new Product("Slippers",200,30);
System.out.println(p instanceof Product);
p.Display();
System.out.println("New Discount: "+p.updateDiscount(20));
}
}

