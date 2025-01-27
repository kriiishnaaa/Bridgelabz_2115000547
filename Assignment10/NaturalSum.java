import java.util.*;
public class NaturalSum{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println("Sum of "+number+" natural numbers using recursion is: "+FindSum(number)+" and through loop is: "+FindSum2(number));
}
public static int FindSum2(int number){
int sum=0;
for(int i=1;i<=number;i++){
sum+=i;
}
return sum;
}
public static int FindSum(int number){
if(number==0)
return 0;
return number+FindSum(number-1);
}
}
