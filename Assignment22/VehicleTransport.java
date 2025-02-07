class Vehicle{ 
int mSpeed; 
String fType; 
public Vehicle(int mSpeed,String fType){ 
this.mSpeed=mSpeed; 
this.fType=fType; 
} 
public void displayInfo(){ 
System.out.println("Maximum Speed = "+mSpeed); 
System.out.println("Fuel Type = "+fType); 
} 
} 
class Car extends Vehicle{ 
int sCapacity; 
public Car(int mSpeed,String fType,int sCapacity){ 
super(mSpeed,fType); 
this.sCapacity=sCapacity; 
} 
public void displayInfo(){ 
System.out.println("Car Details:-"); 
super.displayInfo(); 
System.out.println("Seat Capacity: "+sCapacity); 
} 
} 
class Truck extends Vehicle{ 
double lCapacity; 
public Truck(int mSpeed,String fType,double lCapacity){ 
super(mSpeed,fType); 
this.lCapacity=lCapacity; 
} 
public void displayInfo(){ 
System.out.println("Truck Details:-"); 
super.displayInfo(); 
System.out.println("Load Capacity: "+lCapacity+" tons"); 
} 
} 
class Motorcycle extends Vehicle{ 
boolean hSideCar; 
public Motorcycle(int mSpeed,String fType,boolean hSideCar){ 
super(mSpeed,fType); 
this.hSideCar=hSideCar; 
} 
public void displayInfo(){ 
System.out.println("MotorCycle Details:-"); 
super.displayInfo(); 
System.out.println("Has Sidecar: "+hSideCar); 
} 
} 
public class VehicleTransport{ 
public static void main(String[] args){ 
Vehicle[] v={ 
new Car(200,"Petrol",5), 
new Truck(120,"Diesel",10), 
new Motorcycle(180,"Petrol",false) 
}; 
for(Vehicle vh:v){ 
vh.displayInfo(); 
System.out.println(); 
} 
} 
}
