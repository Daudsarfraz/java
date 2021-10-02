	import java.util.Scanner;
	public class Task4
	{
	public static void main(String[] args)
	{
		String Name;
		int Age;
		String city;
		String collegeName;
		String Profession;

		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		Name = key.nextLine();

		System.out.println("Enter your Age : ");
		Age = key.nextInt();

		System.out.println("Enter your City : ");
		city = key.nextLine();

		System.out.println("Enter your College Name : ");
		collegeName = key.nextLine();

		System.out.println("Enter your Profession : ");
		Profession = key.nextLine();

		System.out.println("There was once a person named " + Name + " who lived in " + city + ".At the age of " + Age + " , " + Name + " went to college at " + collegeName + " , " + Name + " graduated " + " and went to work as a " + Profession + " . ");
	}
	} 
