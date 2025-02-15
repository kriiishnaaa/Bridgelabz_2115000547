public class TargetInMatrix{
public static void main(String [] args){
int [][] mat={{1,2,3,4},{5,6,7,8},{9,10,12,13}};
int element=9;
System.out.println(search(mat,element));
}
public static boolean search(int [][] mat,int element){
int left=0,right=mat.length*mat[0].length-1;
while(left<right){
int mid=(left+right)/2;
if(mat[mid/mat[0].length][mid%mat[0].length]==element)
return true;
else if(mat[mid/mat[0].length][mid%mat[0].length]>element)
right=mid-1;
else
left=mid+1;
}
return false;
}
}
