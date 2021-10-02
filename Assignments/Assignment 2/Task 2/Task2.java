	public class Task2
	{
	public static void main(String[] args)
	{
		int numShares = 1000;
		double purchasePrice = 32.87;
		double sellingPrice = 33.92;
		double brokerCommissionRate = 0.02;
		double stockPurchase = (numShares * purchasePrice);
		double purchaseCommission = stockPurchase * brokerCommissionRate;
		double amountPaid = stockPurchase + purchaseCommission;
		double stockSale = numShares * sellingPrice;
		double sellingCommission =(numShares * sellingPrice)* brokerCommissionRate;
		double amountRecived = stockSale - sellingCommission;
		double profitOrLoss =  amountRecived - amountPaid;
		System.out.println("Joe paid $" + stockPurchase + " for the stock.");
		System.out.println("Joe paid his broker a commission of $"  + purchaseCommission + " on the purchase.");
		System.out.println("So, Joe paid a total of $ " + amountPaid + "\n");
		System.out.println("Joe sold the stock for $ " + stockSale);
		System.out.println("Joe paid his broker a commission of $" + sellingCommission + " on the sale.");
		System.out.println("so, Joe received a total of $ " + amountRecived + "\n");
		System.out.println("Joe's profitOrLoss : $" + profitOrLoss);
	

	}
	
	}
