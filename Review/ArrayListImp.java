import java.util.*;
public class ArrayListImpl{
public static void main(String [] args){
ArrayList al=new ArrayList();
al.add(12);
al.add(13);
al.add(23);
al.add(45);
al.add(78);
al.remove(45);
System.out.println(al.get(4));
}
}
class ArrayList{
int [] arr;
int index;
public ArrayList(){
arr=new int[10];
}
public void add(int element){
if(index==arr.length){
int arr1[]=new int[arr.length*2];
for(int i=0;i<arr.length;i++){
arr1[i]=arr[i];
}
arr=arr1;
}
arr[index]=element;
index++;
}
public void remove(int element){
for(int i=0;i<arr.length;i++){
if(arr[i]==element){
System.out.println("Element Removed");
for(int j=i;j<arr.length-1;j++){
arr[j]=arr[j+1];
}
index--;
break;
}
}
}
public int get(int ind){
if(ind>=arr.length){
System.out.println("Enter valid index");
return -1;
}
return arr[ind];
}
}
