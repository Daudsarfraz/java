	public class InchesToMillimeter

{

	public static void main(String[] args) 
	{

	double letter_Length = 8.5;
	double letter_Width = 11;
	double MM_PER_INCHE = 25.4;

	double Perimeter = 2 * (letter_Length + letter_Width);

	double Diagonal = Math.sqrt(Math.pow(letter_Length, 2) + Math.pow(letter_Width, 2));

	System.out.println("A letter-size (8.5 * 11 inches) sheet " +
	
	"of paper in millimeters is :");
	
	System.out.println(letter_Length*MM_PER_INCHE + " * " +letter_Width*MM_PER_INCHE); 

	System.out.println();
	
	System.out.println("Perimetr of a letter-size (8.5 * 11 inches) sheet is");

	System.out.println(Perimeter);
	
	System.out.println();

	System.out.println("Diagonal of a letter-size (8.5 * 11 inches) sheet is");

	System.out.println(Diagonal);	 	
	}


}
