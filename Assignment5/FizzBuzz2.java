import java.util.Scanner;
public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
	int i=0;
        while(i<=number){
        if(i%3==0 && i%5==0)
        System.out.println("FizzBuzz");
        else if(i%3==0)
        System.out.println("Fizz");
        else if(i%5==0)
        System.out.println("Buzz");
        else
        System.out.println(i);
	i++;
        }
    }
}

