import java.util.*;
public class StockSpan{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] stocks=new int[n];
for(int i=0;i<n;i++){
stocks[i]=sc.nextInt();
}
int [] ans=stockSpan(stocks,n);
for(int i:ans){
System.out.print(i+" ");
}
}
public static int [] stockSpan(int [] stocks, int n){
int [] ans=new int[n];
Stack<Integer> st=new Stack<>();
for(int i=0;i<n;i++){
while(!st.isEmpty() && stocks[st.peek()]<=stocks[i])
st.pop();
if(st.isEmpty())
ans[i]=i+1;
else
ans[i]=i-st.peek();
st.push(i);
}
return ans;
}
}
