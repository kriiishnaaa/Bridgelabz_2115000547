import java.util.*;
public class PetrolPumps{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int [] petrol={4, 6, 7, 4};
int [] distance={6, 8, 3, 5};
int surplus=0;
int deficit=0;
int start=0;
for(int i=0;i<n;i++){
surplus+=petrol[i]-distance[i];
if(surplus<0){
start=i+1;
deficit+=surplus;
surplus=0;
}
}
if(surplus+deficit>=0)
System.out.println(start);
else
System.out.println(-1);
}
}

