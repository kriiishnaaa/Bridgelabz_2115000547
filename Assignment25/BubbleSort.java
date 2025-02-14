import java.util.*;
public class BubbleSort{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
int n=sc.nextInt();
int [] marks=new int[n];
System.out.println("Enter the marks of students");
for(int i=0;i<n;i++){
marks[i]=sc.nextInt();
}
marks=sort(marks);
for(int i:marks){
System.out.println(i+" ");
}
}
public static int[] sort(int [] marks){
for(int i=0;i<marks.length-1;i++){
for(int j=0;j<marks.length-i-1;j++){
if(marks[j]>marks[j+1]){
int temp=marks[j];
marks[j]=marks[j+1];
marks[j+1]=temp;
}
}
}
return marks;
}
}
