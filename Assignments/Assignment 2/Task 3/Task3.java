	import java.util.Scanner;
	public class Task3
	{
	public static void main(String[] args)
	{
		double stateRate = 0.04;
		double countyRate = 0.02;
		
		double purchase;
		double stateTax;
		double countyTax;
		double totalTax;
		double totalCost;
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		purchase = keyboard.nextDouble();

		stateTax = purchase * stateRate;
		countyTax = purchase * countyRate;
		totalTax = stateTax + countyTax;
		totalCost = purchase + totalTax;

		System.out.println("purchase amount : $ " + purchase);
		System.out.println("state tax : $ " + stateTax);
		System.out.println("county tax : $ " + countyTax);
		System.out.println("total tax : $ " + totalTax);
		System.out.println("total cost : $ " + totalCost);	
	} 
	
	}
  
