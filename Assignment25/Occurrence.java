public class Occurrence{
public static void main(String [] args){
int [] arr={6,2,8,2,6,1,9,5,3,6,0,6,1};
int target=6;
occurrence(arr,target);
}
public static void occurrence(int [] arr, int target){
int first=0;
int i;
for(i=0;i<arr.length;i++){
if(arr[i]==target){
first=i;
break;
}
}
int last=first;
for(int j=i+1;j<arr.length;j++){
if(arr[j]==target){
last=j;
}
}
System.out.println("First Occurrence at index: "+first);
System.out.println("Last Occurrence at index: "+last);
}
}
