import java.util.Scanner;

public class Exercise5
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner
		
		System.out.println("Please Enter The price per pound of package \"A\": "); //prompt user for the boltss
		double priceA = input.nextDouble();

		System.out.println("Please Enter The percent lean in package \"A\": "); //prompt user for the boltss
		double leanA = input.nextDouble();	

		System.out.println("Please Enter The price per pound of package \"B\": "); //prompt user for the boltss
		double priceB = input.nextDouble();
		
		System.out.println("Please Enter The percent lean in package \"B\": "); //prompt user for the boltss
		double leanB = input.nextDouble();
		
		System.out.println("\nPackage A cost per pound of lean: "+ (priceA/leanA)/100); 
		System.out.println("\nPackage B cost per pound of lean: "+ (priceB/leanB)/100);
		if ((priceA/leanA)> (priceB/leanB)) {
			System.out.println("\nPackage B is the best value"); 
		}
		else 
		{
			System.out.println("\nPackage A is the best value");
		}
	}
}
	