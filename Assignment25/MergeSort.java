import java.util.*;
public class MergeSort{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of books");
int n=sc.nextInt();
int [] prices=new int[n];
System.out.println("Enter the prices of books");
for(int i=0;i<n;i++){
prices[i]=sc.nextInt();
}
prices=sort(prices,0,prices.length-1);
for(int i:prices){
System.out.println(i+" ");
}
}
public static int [] sort(int [] prices, int start, int end){
if(start==end){
int bs[]=new int[1];
bs[0]=prices[start];
return bs;
}
int mid=(start+end)/2;
int [] firstSort=sort(prices,start,mid);
int [] secondSort=sort(prices,mid+1,end);
return merge(firstSort,secondSort);
}
public static int[] merge(int [] a, int [] b){
int ans[]=new int[a.length+b.length];
int i=0,j=0,k=0;
while(i<a.length && j<b.length){
if(a[i]>b[j]){
ans[k]=b[j];
j++;
}
else{
ans[k]=a[i];
i++;
}
k++;
}
while(i<a.length){
ans[k]=a[i];
k++;i++;
}
while(j<b.length){
ans[k]=b[j];
k++;j++;
}
return ans;
}
}
