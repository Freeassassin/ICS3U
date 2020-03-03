/*
 * Variables Assignment V 1.0
 * Farbod Mohammadzadeh
 * Mr. Rosenberg ICS3U1
 * A program to showcase the variety of the Java data types 
 * */
public class MohammadzadehF_VaribalesAssignmnet 
{
	public static void main(String[] args) 
	{
		// assign variables that represent a rectangles properties
		double width = 10;
		double length = 20;
		double area = 0;
		double perimeter = 0;
		// display variables to the user
		System.out.println("The length of your rectangle is: "+ length + " units");
		System.out.println("The width of your rectangle is: "+ width + " units\n");
		// set the perimeter variable by doubling the addition of length and width
		perimeter = 2*(length+width);
		// display the perimeter 
		System.out.println("The Perimeter is 2 * Length ("+ length+") + 2 * Width ("+width+")");
		System.out.println("P = "+perimeter+" units\n");
		// set the area variable by multiplying the length and width
		area = width*length;
		// display the area
		System.out.println("The area is Length ("+ length+") * Width ("+width+")");
		System.out.println("A= "+area+" units^2\n\n\n\n");
		
		// assign the variables that represent a circle
		double radius = 10;
		float Cperimeter = 0;
		double Carea = 0;
		// set the perimeter and area using pi*R^2 and 2*pi*R
		Cperimeter = (float) (3.14*radius*2);
		Carea = 3.14*radius*radius;
		// display properties of the circle 
		System.out.println("The radius of your circle is: "+radius+" units");
		System.out.println("The perimeter is: "+Cperimeter+" units");
		System.out.println("The area is: "+Carea+" units^2\n\n\n\n\n");
		
		// assign the variables that represent two different types of temperatures
		double celTemp = 3;
		double fahTemp = celTemp*9/5 + 32;
		// display the different temperatures
		System.out.println(celTemp+" Celsius degree in Fahrenheit is equals to "+fahTemp+" degrees\n\n\n\n");
		
		// assign the variables for different subject and their average
		double math = 64.7;
		double english = 91.0;
		double chemistry = 92.6;
		double compSci = 99.4;
		double average = (math+english+chemistry+compSci)/4;
		// display the course marks and their average
		System.out.println("Your Marks:\n\nMath: "+math+"%\nEnglish: "+english+"%\nChemistry: "+chemistry+"%\nComputer Science: "+compSci+"%\n");
		System.out.println("Your Average is: "+ average+"%");
		
	}
}
