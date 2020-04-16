import java.util.Scanner; 

public class Exercise2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner
		
		final int boltPrice = 5;
		final int nutPrice = 2;
		final int washerPrice = 3;
		
		System.out.println("Please Enter Number of Bolts: "); //prompt user for the boltss
		int bolts = input.nextInt();  // 
		System.out.println("Please Enter Number of nuts: "); //prompt user for the nuts
		int nuts = input.nextInt();
		System.out.println("Please Enter Number of Washers: "); //prompt user for the washers
		int washer = input.nextInt();
		
		if (bolts <= nuts)
		{
			if (2*bolts <= washer) 
			{
				System.out.println("Your Order Is Fine\n");
			}
			else 
			{
				System.out.println("Check the Order: too few washers\n");
			}
		}
		else 
		{
			System.out.println("Check the Order: too many bolts\n");
			if (2*bolts <= washer) 
			{
				System.out.println("Washer Amount Good");
			}
			else 
			{
				System.out.println("Check the Order: too few washers\n");
			}
		}
		
		System.out.println("Number of bolts: "+ bolts);
		System.out.println("Number of nuts: "+ nuts);
		System.out.println("Number of washers: "+ washer + "\n\n\n");
		int total = (bolts*boltPrice) + (nuts*nutPrice) + (washer*washerPrice);
		
		System.out.println("Your Total Is: "+ total);
	}
}