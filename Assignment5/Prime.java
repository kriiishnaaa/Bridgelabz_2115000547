import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
	int count=0;
        for(int i=2;i<=number/2;i++){
	if(number%i==0)
	count++;
	}
	if(count==0)
	System.out.println("Number is prime");
	else
	System.out.println("Number is not prime");
    }
}

