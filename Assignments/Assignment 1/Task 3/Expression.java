import java.util.Scanner;
public class Expression{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	int m , n ;
	System.out.println("Enter first number : ");
	m = keyboard.nextInt();
	System.out.println("Enter second number : ");
	n = keyboard.nextInt();
	System.out.println("n / 10 + n % 10 = "+ (n/10+n%10));
	System.out.println("n % 2 + m % 2 = "+(n%2+m%2));
	System.out.println("(m + n) / 2 = "+((m + n) / 2));
	System.out.println("(m + n) / 2.0 = "+ (m + n) / 2.0);
	System.out.println("(0.5 * (m + n)) = "+ (int)(0.5 * (m + n)));
	System.out.println("Math.round(0.5 * (m + n)) = "+((int)Math.round(0.5 * (m + n))));	
}




}
