public static void main(String[] args) {
InventoryManager manager = new InventoryManager();
manager.addItemAtEnd("Laptop", 101, 5, 800.0);
manager.addItemAtEnd("Phone", 102, 10, 500.0);
manager.displayInventory();
System.out.println("Total Inventory Value: " + manager.calculateTotalValue());
}
}
class Item{
String itemName;
int itemId;
int quantity;
double price;
Item next;
public Item(String itemName, int itemId, int quantity, double price) {
this.itemName=itemName;
this.itemId=itemId;
this.quantity=quantity;
this.price=price;
this.next=null;
}
}
class InventoryManager {
private Item head=null;
public void addItemAtBeginning(String itemName, int itemId, int quantity, double price){
Item newItem=new Item(itemName, itemId, quantity, price);
newItem.next=head;
head=newItem;
}
public void addItemAtEnd(String itemName, int itemId, int quantity, double price){
Item newItem=new Item(itemName, itemId, quantity, price);
if(head==null){
head=newItem;
return;
}
Item temp=head;
while(temp.next!=null) temp=temp.next;
temp.next=newItem;
}
public void removeItem(int itemId){
if (head==null) return;
if (head.itemId==itemId){
head=head.next;
return;
}
Item temp=head, prev=null;
while (temp!=null && temp.itemId!=itemId) {
prev=temp;
temp=temp.next;
}
if(temp!=null) prev.next=temp.next;
}
public void updateQuantity(int itemId, int quantity){
Item temp=head;
while (temp!=null) {
if (temp.itemId==itemId) {
temp.quantity=quantity;
return;
}
temp=temp.next;
}
}
public void searchItem(int itemId){
Item temp=head;
while (temp!=null){
if (temp.itemId==itemId){
System.out.println(temp.itemName+" (ID: "+temp.itemId+", Quantity: "+temp.quantity+", Price: "+temp.price+")");
return;
}
temp=temp.next;
}
}
public void searchItem(String itemName){
Item temp=head;
while(temp!=null){
if(temp.itemName.equalsIgnoreCase(itemName)){
System.out.println(temp.itemName+" (ID: "+temp.itemId+", Quantity: "+temp.quantity+", Price: "+temp.price+ ")");
return;
}
temp=temp.next;
}
}
public void displayInventory() {
Item temp=head;
while(temp!=null) {
System.out.println(temp.itemName+" (ID: "+temp.itemId+", Quantity: "+temp.quantity+", Price: "+temp.price+")");
temp=temp.next;
}
}
public double calculateTotalValue() {
double total=0;
Item temp=head;
while(temp!=null) {
total+=temp.price*temp.quantity;
temp=temp.next;
}
return total;
}
}
