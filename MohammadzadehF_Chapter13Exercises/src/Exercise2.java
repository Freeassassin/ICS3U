import java.util.Scanner; //we will need the scanner for user input

public class Exercise2 
{ //name of the class
	
	public static void main(String[] args)
	{ // main method
		Scanner input = new Scanner(System.in); //declaring new scanner "input"
		
		System.out.println("Please Enter The Air Temperture: ");
		double Tair = input.nextDouble();
		
		System.out.println("Please Enter The Steam Temperture: ");
		double Tsteam = input.nextDouble();
		
		double efficiency = (1 - (Tair/Tsteam));
		if (Tsteam < 373)
		{
			System.out.println("The Efficiency Is: 0");
		}
		else 
		{
			System.out.println("The Efficiency Is: "+ efficiency);	
		}
		
	}
}
