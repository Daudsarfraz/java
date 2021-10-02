public class Ingredient{
	public static void main(String[] args){
	int noOfCookies = 48;
	double sugar = 1.5;
	double butter = 1;
	double flour = 2.75;
	int cookiesToBeMade = 200;
	double sugarRequired = cookiesToBeMade * (sugar / noOfCookies);
	double butterRequired= cookiesToBeMade * (butter / noOfCookies);
	double flourRequired= cookiesToBeMade * (flour / noOfCookies);
	System.out.println("No of cookies = "+ cookiesToBeMade);
	System.out.println("Ingredients Required:");
	System.out.println("Sugar = " + sugarRequired + " cup");
	System.out.println("Butter = "+ butterRequired+ " cup");
	System.out.println("Flour = "+ flourRequired+ " cup");
	





	}//main






}//class
