import java.util.*;
public class CountingSort{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
int n=sc.nextInt();
int [] ages=new int[n];
System.out.println("Enter the ages of students");
for(int i=0;i<n;i++){
ages[i]=sc.nextInt();
}
ages=sort(ages);
for(int i:ages){
System.out.print(i+" ");
}
}
public static int [] sort(int [] ages){
int max=Arrays.stream(ages).max().getAsInt();
int [] freq=new int[max+1];
for(int i=0;i<ages.length;i++){
freq[ages[i]]++;
}
for(int i=1;i<=max;i++){
freq[i]=freq[i]+freq[i-1];
}
int sorted[]=new int[ages.length];
for(int i=ages.length-1;i>=0;i--){
int c=freq[ages[i]]-1;
sorted[c]=ages[i];
freq[ages[i]]--;
}
return sorted;
}
}

//employee class:name,id,age,department and salary
//main method: add entries
//interface add update delete display

