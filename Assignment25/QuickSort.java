import java.util.*;
public class QuickSort{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of products");
int n=sc.nextInt();
int [] prices=new int[n];
System.out.println("Enter the prices of products");
for(int i=0;i<n;i++){
prices[i]=sc.nextInt();
}
sort(prices,0,prices.length-1);
for(int i:prices){
System.out.print(i+" ");
}
}
public static void sort(int [] arr,int si,int ei){
if(si>=ei)
{
return;
}
int pi=CorrectPosition(arr,si,ei);
sort(arr,si,pi-1);
sort(arr,pi+1,ei);
}
public static int CorrectPosition(int [] arr,int si,int ei){
int item=arr[ei];
int ci=si;
for(int i=si;i<ei;i++)
{
if(arr[i]<=item)
{
int temp=arr[i];
arr[i]=arr[ci];
arr[ci]=temp;
ci++;
}
}
int temp=arr[ci];
arr[ci]=arr[ei];
arr[ei]=temp;
return ci;
}
}
