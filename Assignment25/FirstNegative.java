import java.util.*;
public class Firstnegative{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int index=negative(arr);
System.out.println(index);
}
public static int negative(int [] arr){
for(int i=0;i<arr.length;i++){
if(arr[i]<0)
return i;
}
return -1;
}
}
