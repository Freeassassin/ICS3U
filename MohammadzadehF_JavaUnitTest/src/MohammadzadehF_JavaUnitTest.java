/**/
import java.util.Scanner;
import java.text.NumberFormat;
public class MohammadzadehF_JavaUnitTest 
{
	public static void main(String[] args) 
	{
		NumberFormat numberformat = NumberFormat.getInstance();	
		numberformat.setMaximumFractionDigits(1);
		
		System.out.print("\t\tSphere Calculator\n\n");
		Scanner input = new Scanner(System.in);
		
		final double PI = Math.PI;
		System.out.print("Please Enter An Integer Radius ");
		double radius = input.nextDouble();
		double volume = (4*(PI*(Math.pow(radius,3))))/3;
		System.out.print("Please Enter A Unit Type ");
		String unit = input.next();
		System.out.print("\nThe Volume Of A Sphere With The Radius of "+radius+" "+unit+" Is: "+numberformat.format(volume)+" "+unit+"^3");
		
	}
}
