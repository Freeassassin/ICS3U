import java.util.Scanner;

public class Exercise4 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner
		
		System.out.println("Please Enter Your Weight: "); //prompt user for the boltss
		int weight = input.nextInt();  // 
		
		if (280 >= weight && weight >= 220)  
		{
			System.out.print("The Contestant Is Allowed In The Contest");
		}
		else 
		{
			System.out.print("The Contestant Is Not Allowed In The Contest");
		}
	}
}
