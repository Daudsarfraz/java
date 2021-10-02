
import java.util.Scanner;
public class Digits

{

	public static void main(String[] args)

	{

		int num;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the the number upto 5 digits with no negative digit");
		num = key.nextInt();

		int n1 = (num / 10000 % 10);
		int n2 = (num / 1000 % 10);
		int n3 = (num / 100 % 10);
		int n4 = (num / 10 % 10);
		int n5 = (num % 10);

		System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);


	}

}
