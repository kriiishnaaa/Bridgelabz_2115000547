import java.util.*;
public class DataStructureComparison{
public static void main(String [] args){
int size1=1000;
int size2=10000;
int size3=1000000;
DataStructures ds=new DataStructures();
ds.array(size1,999);
ds.hashSet(size1,999);
ds.treeSet(size1,999);
ds.array(size2,9999);
ds.hashSet(size2,9999);
ds.treeSet(size2,9999);
ds.array(size3,99999);
ds.hashSet(size3,99999);
ds.treeSet(size3,99999);
}
}
class DataStructures{
public void array(int size, int target){
int [] arr=new int[size];
long start=System.nanoTime();
for(int i=0;i<arr.length;i++){
if(arr[i]==target)
break;
}
long end=System.nanoTime();
System.out.println("Time taken by array of size "+size+" is "+(end-start));
}
public void hashSet(int size, int target){
HashSet<Integer> hs=new HashSet<>(size);
for(int i=1;i<=size;i++){
hs.add(i);
}
long start=System.nanoTime();
for(int i:hs){
if(i==target)
break;
}
long end=System.nanoTime();
System.out.println("Time taken by HashSet of size "+size+" is "+(end-start));
}
public void treeSet(int size, int target){
TreeSet<Integer> ts=new TreeSet<>();
for(int i=0;i<=size;i++){
ts.add(i);
}
long start=System.nanoTime();
for(int i:ts){
if(i==target)
break;
}
long end=System.nanoTime();
System.out.println("Time taken by TreeSet of size "+size+" is "+(end-start));
}
}
