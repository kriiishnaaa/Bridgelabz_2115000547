import java.util.*;
class Doctor{ 
String dName; 
ArrayList<Patient> pList; 
public Doctor(String dName){ 
this.dName=dName; 
pList=new ArrayList<>(); 
} 
public void consult(Patient p){ 
System.out.println("Doctor "+dName+" is consulting with Patient "+p.pName); 
pList.add(p); 
p.addConsultation(this); 
} 
public void showConsultations(){ 
System.out.println("Doctor "+dName+" has consulted with the following patients:"); 
for(Patient p:pList){ 
System.out.println(" Patient:"+p.pName); 
} 
} 
} 
class Patient{ 
String pName; 
ArrayList<Doctor> dList; 
public Patient(String pName){ 
this.pName=pName; 
dList=new ArrayList<>(); 
} 
public void addConsultation(Doctor d){ 
dList.add(d); 
} 
public void showDoctors(){ 
System.out.println("Patient "+pName+" has consulted the following doctors:"); 
for(Doctor d:dList){ 
System.out.println(" Doctor:"+d.dName); 
} 
} 
} 
class Hospital{ 
String hName; 
ArrayList<Doctor> dList; 
ArrayList<Patient> pList; 
public Hospital(String hName){ 
this.hName=hName; 
dList=new ArrayList<>(); 
pList=new ArrayList<>(); 
} 
public void addDoctor(Doctor d){ 
dList.add(d); 
} 
public void addPatient(Patient p){ 
pList.add(p); 
} 
public void showHospitalDetails(){ 
System.out.println("Hospital:"+hName); 
for(Doctor d:dList){ 
d.showConsultations(); 
} 
for(Patient p:pList){ 
p.showDoctors(); 
} 
} 
} 
public class HospitalDetails{ 
public static void main(String[] args){ 
Hospital h=new Hospital("City Health Hospital"); 
Doctor d1=new Doctor("Dr. Smith"); 
Doctor d2=new Doctor("Dr. Johnson"); 
Patient p1=new Patient("Alice"); 
Patient p2=new Patient("Bob"); 
h.addDoctor(d1); 
h.addDoctor(d2); 
h.addPatient(p1); 
h.addPatient(p2); 
d1.consult(p1); 
d2.consult(p1); 
d1.consult(p2); 
h.showHospitalDetails(); 
} 
}
