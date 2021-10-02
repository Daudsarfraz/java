import java.util.Scanner;
public class CircleSphere

{

	public static void main(String[] args)
	{
		
		int radiusCircle;
		Scanner key = new Scanner(System.in);

		System.out.println("Enetr the radius of circle");

		radiusCircle = key.nextInt();

		double area = Math.PI*Math.pow(radiusCircle, 2);

		double circumference = 2 * Math.PI * radiusCircle;

		System.out.println("Radius of circle is : " + radiusCircle);

		System.out.println("Area of circle is : " + area);

		System.out.println("Circumference of circle is : " + circumference);

		System.out.println();

		int radiusSphere;

		System.out.println("Enter the radius of sphere");

		radiusSphere = key.nextInt();


		double volumeOfSphere = (4/3)* Math.PI * Math.pow(radiusSphere, 3);

		double surfaceArea = 4 * Math.PI * Math.pow(radiusSphere, 3);

		
		System.out.println("Volume of sphere is : " + volumeOfSphere);

		System.out.println("Surface area of sphere is : " + surfaceArea);






	}


}
