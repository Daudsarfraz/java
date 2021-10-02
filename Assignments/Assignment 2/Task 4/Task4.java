	import java.util.Scanner;
	public class Task4
	{
    public static void main(String[] args)
    {
	double gas,mpg;    
	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the number of gallons of gas in the tank ");
    	gas = in.nextDouble();
	Scanner key = new Scanner(System.in);
    	System.out.println("Enter the fuel efficiency ");
	mpg = in.nextDouble();
	double COST_PER_GALLON = 3.95;
    	double cost = (100 / mpg) * COST_PER_GALLON;  
    	System.out.print("Cost:");
    	System.out.printf("%12.2f\n", cost);
    	
         }
	 
	}
