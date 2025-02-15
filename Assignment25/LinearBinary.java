import java.util.*;
public class LinearBinary{
public static void main(String [] args){
int [] arr={1,5,2,8,3,6,9,10};
int target=8;
Arrays.sort(arr);
System.out.println(Linear(arr));
System.out.println(Binary(arr,target));
}
public static int Linear(int [] arr){
int start=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]!=i+start)
return i+start;
}
return arr[arr.length-1]+1;
}
public static int Binary(int [] arr,int target){
int low=0,high=arr.length-1;
while(low<=high){
int mid=(low+high)/2;
if(arr[mid]==target){
return mid;
}
else if(arr[mid]>target)
high=mid-1;
else
low=mid+1;
}
return -1;
}
}
