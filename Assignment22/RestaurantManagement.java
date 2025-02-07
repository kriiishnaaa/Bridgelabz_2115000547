interface Worker{ 
void performDuties(); 
} 
class Person{ 
String pName; 
int pId; 
public Person(String pName,int pId){ 
this.pName=pName; 
this.pId=pId; 
} 
public String getName(){ 
return pName; 
} 
public int getId(){ 
return pId; 
} 
} 
class Chef extends Person implements Worker{ 
public Chef(String pName,int pId){ 
super(pName,pId); 
} 
public void performDuties(){ 
System.out.println(getName()+" is cooking."); 
} 
} 
class Waiter extends Person implements Worker{ 
public Waiter(String pName,int pId){ 
super(pName,pId); 
} 
public void performDuties(){ 
System.out.println(getName()+" is serving food."); 
} 
} 
public class RestaurantManagement{ 
public static void main(String[] args){ 
Chef c=new Chef("John",1); 
Waiter w=new Waiter("Alice",2); 
c.performDuties(); 
w.performDuties(); 
} 
}
