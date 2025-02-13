import java.util.*;
public class SlidingWindowMaximum{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int k = 3;
slidingWindow(arr, n, k);
}
public static void slidingWindow(int [] arr, int n, int k){
Deque<Integer> dq=new LinkedList<>();
int i;
for(i=0;i<k;i++){
while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
dq.pollLast();
dq.addLast(i);
}
for(;i<n;i++){
System.out.print(arr[dq.peek()]+" ");
while(!dq.isEmpty() && dq.peek()<=i-k)
dq.removeFirst();
while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
dq.removeLast();
dq.addLast(i);
}
System.out.print(arr[dq.peek()]);
}
}
