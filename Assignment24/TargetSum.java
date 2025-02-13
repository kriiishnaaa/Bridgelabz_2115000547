import java.util.*;
class TargetSum {
public static boolean hasSum(int[] arr, int target) {
Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++) {
if(map.containsKey(target-arr[i])) return true;
map.put(arr[i],i);
}
return false;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int target=sc.nextInt();
System.out.println(hasSum(arr,target));
}
}
