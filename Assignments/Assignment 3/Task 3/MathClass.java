	import java.util.Scanner;

	public class MathClass

{
	public static void main(String[] args)
	{
	int number;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	number = keyboard.nextInt();
	
	int lastDigit;
		
	lastDigit = number%10;
	
	System.out.println("The last digit of your number is : " + lastDigit); 
	int remain = (int)Math.log10(number);
	
	int firstDigit;
	
	firstDigit = (int)(number / Math.pow(10, remain));

	System.out.println("The first digit of your number is : " + firstDigit);  

	
	}

}   
