import java.util.Scanner;

public class Exercise6 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner

		System.out.println("Please Enter The Wind Speed: "); //prompt user for the boltss
		double V = input.nextDouble();

		System.out.println("Please Enter The Temperature: "); //prompt user for the boltss
		double Temp = input.nextDouble();
		
		if (0<= V && V <= 4) 
		{
			System.out.println("The WCI is: "+ Temp);			
		}
		else if (V >= 45) 
		{
			System.out.println("The WCI is: "+ (Temp*1.6 - 55));
		}
		else 
		{
			System.out.println("The WCI is: "+ (91.4 + (91.4 - Temp)*((0.0203*V) - (0.304*(Math.sqrt(V)) - 0.474))));
		}
	}
}
