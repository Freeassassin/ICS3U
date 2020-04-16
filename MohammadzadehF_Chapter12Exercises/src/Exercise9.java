import java.util.Scanner;

public class Exercise9
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner

		System.out.println("Please Enter Your Age: "); //prompt user for the boltss
		int age = input.nextInt();

		System.out.println("Please Enter The Time: "); //prompt user for the boltss
		int time = input.nextInt();
		
		if (time < 1700) 
		{
			if (age > 13) 
			{
				System.out.println("Your Price Is: "+ 5.00 + "$");				
			}
			else 
			{
				System.out.println("Your Price Is: "+ 2.00 + "$");				
			}
		}
		else if (time > 1700 && time < 2200)
		{
			if (age > 13) 
			{
				System.out.println("Your Price Is: "+ 8.00 + "$");				
			}
			else 
			{
				System.out.println("Your Price Is: "+ 4.00 + "$");				
			}
		}
		else 
		{
			if (age > 13) 
			{
				System.out.println("Your Price Is: "+ 4.00 + "$");				
			}
			else 
			{
				System.out.println("Children Are Not Allowed At This Time");				
			}
		}
	}
}
