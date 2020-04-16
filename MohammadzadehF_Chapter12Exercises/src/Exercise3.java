import java.util.Scanner;

public class Exercise3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner
		
		System.out.println("Please Enter Your Tank Capacity: "); //prompt user for the boltss
		int tank = input.nextInt();  // 
		System.out.println("Please Enter Your Gage reading(0-100): "); //prompt user for the nuts
		int gage = input.nextInt();
		System.out.println("Please Enter Your Miles Per Gallon: "); //prompt user for the washers
		int MPG = input.nextInt();		
		
		int milesTravle = (tank*gage)/MPG;
				
		if (milesTravle >= 200) 
		{
			System.out.println("Safe To Proceed");
		}
		else 
		{
			System.out.println("Get Gas");
		}
	}
}
