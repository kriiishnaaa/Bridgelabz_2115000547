import java.util.*;
public class InsertionSort{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees");
int n=sc.nextInt();
int [] ids=new int[n];
System.out.println("Enter the id's of employees");
for(int i=0;i<n;i++){
ids[i]=sc.nextInt();
}
ids=sort(ids);
for(int i:ids){
System.out.println(i+" ");
}
}
public static int[] sort(int [] ids){
for(int i=1;i<ids.length;i++){
int j=i-1;
int item=ids[i];
while(j>=0 && ids[j]>item){
ids[j+1]=ids[j];
j--;
}
j++;
ids[j]=item;
}
return ids;
}
}
