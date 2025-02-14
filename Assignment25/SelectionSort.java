import java.util.*;
public class SelectionSort{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
int n=sc.nextInt();
int [] scores=new int[n];
System.out.println("Enter the exam scores of students");
for(int i=0;i<n;i++){
scores[i]=sc.nextInt();
}
scores=sort(scores);
for(int i:scores){
System.out.println(i+" ");
}
}
public static int [] sort(int [] scores){
for(int i=0;i<scores.length-1;i++){
int small=i;
for(int j=i+1;j<scores.length;j++){
if(scores[j]<scores[small])
small=j;
}
int temp=scores[i];
scores[i]=scores[small];
scores[small]=temp;
}
return scores;
}
}
