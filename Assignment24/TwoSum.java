import java.util.*;
public class TwoSum{
public static int[] twoSum(int[] nums,int target){
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
int complement=target-nums[i];
if(map.containsKey(complement)) return new int[]{map.get(complement),i};
map.put(nums[i],i);
}
return new int[]{-1,-1};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int target=sc.nextInt();
System.out.println(Arrays.toString(twoSum(arr,target)));
}
}
