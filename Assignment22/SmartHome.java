public class SmartHome{
public static void main(String [] args){
Device d=new Thermostat(32875662,"Available",23);
d.Display();
}
}
class Device{
public int deviceID;
private String status;
public Device(int deviceID, String status){
this.deviceID=deviceID;
this.status=status;
}
public void Display(){
System.out.println("Device ID: "+deviceID);
System.out.println("Device status: "+status);
}
}
class Thermostat extends Device{
private int temperatureSetting;
public Thermostat(int deviceID, String status, int temperatureSetting){
super(deviceID, status);
this.temperatureSetting=temperatureSetting;
}
public void Display(){
super.Display();
System.out.println("Temperature Setting: "+temperatureSetting);
}
}

