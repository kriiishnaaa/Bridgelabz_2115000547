interface Refuelable{ 
void refuel(); 
} 
class Vehicle{ 
int vSpeed; 
String vModel; 
public Vehicle(int vSpeed,String vModel){ 
this.vSpeed=vSpeed; 
this.vModel=vModel; 
} 
public int getMaxSpeed(){ 
return vSpeed; 
} 
public String getModel(){ 
return vModel; 
} 
} 
class ElectricVehicle extends Vehicle{ 
public ElectricVehicle(int vSpeed,String vModel){ 
super(vSpeed,vModel); 
} 
public void charge(){ 
System.out.println(getModel()+" is charging."); 
} 
} 
class PetrolVehicle extends Vehicle implements Refuelable{ 
public PetrolVehicle(int vSpeed,String vModel){ 
super(vSpeed,vModel); 
} 
public void refuel(){ 
System.out.println(getModel()+" is refueling."); 
} 
} 
public class VehicleManagement{ 
public static void main(String[] args){ 
ElectricVehicle eV=new ElectricVehicle(150,"Tesla Model S"); 
PetrolVehicle pV=new PetrolVehicle(120,"Toyota Corolla"); 
eV.charge(); 
pV.refuel(); 
} 
}
