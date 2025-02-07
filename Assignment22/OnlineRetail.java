public class OnlineRetail{
public static void main(String [] args){
DeliveredOrder d=new DeliveredOrder("07-02-25",true,23156499,"SUIT8934","02-02-25");
d.Display();
d.getOrderStatus();
}
}
class Order{
private String orderDate;
private String orderID;
public Order(String orderDate, String orderID){
this.orderID=orderID;
this.orderDate=orderDate;
}
public void Display(){
System.out.println("Order ID: "+orderID);
System.out.println("Order Date: "+orderDate);
}
}
class ShippedOrder extends Order{
private int trackingNumber;
public ShippedOrder(String orderDate, String orderID, int trackingNumber){
super(orderDate,orderID);
this.trackingNumber=trackingNumber;
}
public void Display(){
super.Display();
System.out.println("Your order has been shipped. Track through: "+trackingNumber);
}
}
class DeliveredOrder extends ShippedOrder{
private String deliveryDate;
private boolean isDelivered;
public DeliveredOrder(String deliveryDate, boolean isDelivered,int trackingNumber, String orderID, String orderDate){
super(orderDate,orderID,trackingNumber);
this.deliveryDate=deliveryDate;
this.isDelivered=isDelivered;
}
public void getOrderStatus(){
if(isDelivered){
System.out.println("Your order has been delivered");
}
else
System.out.println("Your order has either been shipped or in warehouse");
}
public void Display(){
super.Display();
System.out.println("Delivery date: "+deliveryDate);
}
}
