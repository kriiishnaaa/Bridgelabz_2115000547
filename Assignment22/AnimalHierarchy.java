class Animal{ 
String aName; 
int aAge; 
public Animal(String aName,int aAge){ 
this.aName=aName; 
this.aAge=aAge; 
} 
public void makeSound(){ 
System.out.println("Some animal sound"); 
} 
} 
class Dog extends Animal{ 
public Dog(String aName,int aAge){ 
super(aName,aAge); 
} 
public void makeSound(){ 
System.out.println("Bark"); 
} 
} 
class Cat extends Animal{ 
public Cat(String aName,int aAge){ 
super(aName,aAge); 
} 
public void makeSound(){ 
System.out.println("Meow"); 
} 
} 
class Bird extends Animal{ 
public Bird(String aName,int aAge){ 
super(aName,aAge); 
} 
public void makeSound(){ 
System.out.println("Chirp"); 
} 
} 
public class AnimalHierarchy{ 
public static void main(String[] args){ 
Animal a1=new Dog("Jacky",4); 
Animal a2=new Cat("Biloti",1); 
Animal a3=new Bird("Coco",1); 
System.out.print(a1.aName+" ");a1.makeSound(); 
System.out.print(a2.aName+" ");a2.makeSound(); 
System.out.print(a3.aName+" ");a3.makeSound(); 
} 
}
