import java.util.Scanner;

public class Exercise5B 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner
		
		System.out.println("Please Enter Your Year Of Birth: "); //prompt user for the boltss
		int YOB = input.nextInt();

		System.out.println("Please Enter The Current Year: "); //prompt user for the boltss
		int currentYear  = input.nextInt();	

		int age;
		
		if (currentYear > 20 && YOB > 20) 
		{
			age = currentYear - YOB;
			System.out.println("Your Age: "+ age);
		}
		else if (currentYear < 20 && YOB < 20) 
		{
			age = currentYear - YOB;
			System.out.println("Your Age: "+ age);			
		}
		else if (currentYear < 20 && YOB > 20) 
		{
			age = (100+currentYear) - YOB;
			System.out.println("Your Age: "+ age);			
		}
	}
}
