/* Java Math v 1.0
 * Farbod Mohammadzadeh
 * Mr. Rosenberg ICS3U1
 * 2020-03-04
 * This is a program to showcase the abilities within Java Math
 */

// the main class fro this file
public class MohammadzadehF_JavaMathAssignment 
{
	// the main function
	public static void main(String[] args) 
	{
		// declare all the needed variables for this assignment
		int i = 7;
    	int j = -9;
    	double x = 72.3;
    	double y = 0.34; 
    	double angle = 45.0;
    	
    	// display the "x" variable rounded up and down
    	System.out.println("The Variale \"x/72.3\" Rounded Up Is: "+Math.ceil(x));
    	System.out.println("The Variale \"x/72.3\" Rounded Down Is: "+Math.floor(x));
    	// display the "y" variable rounded up and down
    	System.out.println("\nThe Variale \"y/0.34\" Rounded Up Is: "+Math.ceil(y));
    	System.out.println("The Variale \"y/0.34\" Rounded Down Is: "+Math.floor(y));
    	// display the updated "x" variable rounded up and down
    	x = 72.6;    	
    	System.out.println("\nThe Variale \"x/72.6\" Rounded Up Is: "+Math.ceil(x));
    	System.out.println("The Variale \"x/72.6\" Rounded Down Is: "+Math.floor(x));    	
    	// reset the "x" variable
    	x = 72.3;
    	// compare "x" and "y" variables
    	System.out.println("\n\nBetween x and y variabels "+ Math.min(x, y) +" is the lowest number and "+ Math.max(x, y) +" is the highest number");
    	// compare "x" and "i" variables
    	System.out.println("\nBetween x and i variabels "+ Math.min(x, i) +" is the lowest number and "+ Math.max(x, i) +" is the highest number");
    	// compare "j" and "i" variables
    	System.out.println("\nBetween j and i variabels "+ Math.min(j, i) +" is the lowest number and "+ Math.max(j, i) +" is the highest number");
    	// compare "y" and "j" variables
    	System.out.println("\nBetween y and j variabels "+ Math.min(y, j) +" is the lowest number and "+ Math.max(y, j) +" is the highest number");
	
    	// dispaly pi in java math
    	System.out.println("\n\nPie in java Math is: "+ Math.PI);
    	
    	// display the cosin of a 45.0 degree angle
    	System.out.println("\n\nThe Cosine of a 45.0 degree angle is: "+ Math.cos(angle));
    	// display the sin of a 45.0 degree angle
    	System.out.println("\nThe Cosine of a 45.0 degree angle is: "+ Math.sin(angle));
    	
    	// display 2 to the power of 5
    	System.out.println("\n\n2 To the power of 5 is: "+ Math.pow(2,5));
    	// display 5 to the power of 2
    	System.out.println("\n5 To the power of 2 is: "+ Math.pow(5,2));
    	
    	// display the square root of 10
    	System.out.println("\n\nThe square root of 10 is: "+ Math.sqrt(10));
    	
    	// display a random number between 0 and 10
    	System.out.println("\n\nA random number between 0 and 10: "+ (int) (Math.random()*10));
    	// display a random number between 0 and 100
    	System.out.println("\nA random number between 0 and 100: "+ (int) (Math.random()*100));
    	// display a random number between 0 and -1000
    	System.out.println("\nA random number between 0 and -1000: "+ (int) (Math.random()*-1000));
	}
}
