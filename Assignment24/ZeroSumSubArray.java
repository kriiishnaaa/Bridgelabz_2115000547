import java.util.*;
public class ZeroSumSubArray{
public static void main(String [] args){
int[] arr={6,3,-1,-3,4,-2,2,4,6,-12,7};
ZeroSum(arr);
}
public static void ZeroSum(int [] arr){
HashMap<Integer,List<Integer>> hp=new HashMap<>();
int sum=0;
hp.put(0, new ArrayList<>());
hp.get(0).add(-1);
for (int i=0;i<arr.length;i++) {
sum += arr[i];
if (hp.containsKey(sum)) {
for (int start:hp.get(sum)) {
System.out.println((start+1)+" to "+i);
}
}
hp.putIfAbsent(sum, new ArrayList<>());
hp.get(sum).add(i);
}
}
}
