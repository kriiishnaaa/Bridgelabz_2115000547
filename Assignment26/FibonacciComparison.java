import java.util.*;
public class FibonacciComparison{
public static int fibonacciRecursive(int n){
if(n<=1) return n;
return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
}
public static int fibonacciIterative(int n){
int a=0,b=1,sum;
for(int i=2;i<=n;i++){
sum=a+b;
a=b;
b=sum;
}
return b;
}
public static void main(String [] args){
long s1=System.nanoTime();
fibonacciRecursive(10);
long e1=System.nanoTime();
System.out.println("Recursive Fibonacci for 10 elements: "+(e1-s1));
long s2=System.nanoTime();
fibonacciIterative(10);
long e2=System.nanoTime();
System.out.println("Iterative Fibonacci for 10 elements: "+(e2-s2));
long s3=System.nanoTime();
fibonacciRecursive(30);
long e3=System.nanoTime();
System.out.println("Recursive Fibonacci for 30 elements: "+(e3-s3));
long s4=System.nanoTime();
fibonacciIterative(30);
long e4=System.nanoTime();
System.out.println("Iterative Fibonacci for 30 elements: "+(e4-s4));
long s5=System.nanoTime();
fibonacciRecursive(50);
long e5=System.nanoTime();
System.out.println("Recursive Fibonacci for 50 elements: "+(e5-s5));
long s6=System.nanoTime();
fibonacciIterative(50);
long e6=System.nanoTime();
System.out.println("Iterative Fibonacci for 50 elements: "+(e6-s6));
}
}

