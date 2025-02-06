public class Main{
public static void main(String [] args){
Mobility m=new Mobility();
m.move();m.comfort();
Mobility m1=new Car();
m1.move();
Mobility m2=new Scooter();
m2.comfort();
}
}
class Mobility{
void move(){
System.out.println("The vehicle has the capability to move");
}
void comfort(){
System.out.println("The vehicle has full scpe of comfort");
}
}
class Car extends Mobility{
void move(){
System.out.println("The car has capability to move");
}
void engine(){
System.out.println("The car has an excellent engine embedded in it");
}
}
class Scooter extends Mobility{
void comfort(){
System.out.println("The scooter gives comfort of moving");
}
void tyres(){
System.out.println("The scooter uses MRF tyres for safe travelling");
}
}

