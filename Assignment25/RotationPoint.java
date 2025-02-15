import java.util.*;
public class RotationPoint{
public static void main(String [] args){
int [] arr={5,7,12,9,23,6,1};
System.out.println(Point(arr));
}
public static int Point(int [] arr){
int left=0,right=arr.length-1;
while(left<right){
int mid=left + (right-left)/2;
if(arr[mid]>arr[right])
left=mid+1;
else
right=mid;
}
return arr[left];
}
}

