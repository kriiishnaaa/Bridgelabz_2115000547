public class TimeComparison{
public static void main(String [] args){
Builder();
Buffer();
}
public static void Builder(){
int iterations=1_000_000;
StringBuilder sb=new StringBuilder();
String text="hello";
long start=System.nanoTime();
for(int i=0;i<iterations;i++){
sb.append(text);
}
long end=System.nanoTime();
long total=end-start;
System.out.println("Time taken by StringBuilder: "+total);
}
public static void Buffer(){
int iterations=1_000_000;
StringBuffer sb=new StringBuffer();
String text="hello";
long start=System.nanoTime();
for(int i=0;i<iterations;i++){
sb.append(text);
}
long end=System.nanoTime();
long total=end-start;
System.out.println("Time taken by StringBuffer: "+total);
}
}

