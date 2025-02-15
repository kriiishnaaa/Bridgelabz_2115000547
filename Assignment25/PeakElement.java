import java.util.*;
public class PeakElement{
public static void main(String [] args){
int [] arr={1,5,2,8,3,6,9,10};
System.out.println(peak(arr));
}
public static int peak(int [] arr){
int left=0,right=arr.length-1;
while(left<right){
int mid=(left+right)/2;
if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
return arr[mid];
}
if(arr[mid]<arr[mid-1])
right=mid-1;
else if(arr[mid]<arr[mid+1])
left=mid+1;
}
return -1;
}
}
