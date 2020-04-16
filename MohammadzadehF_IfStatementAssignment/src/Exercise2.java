/* If Statement Exercise 2 V1.0
 * 2020-04-16
 * Farbod M.
 * Mr. Rosenburg ICS3U1
 * This is a console based application that gives the user the average of for of their marks and an appropriate grade 
 * */

// import scanner for user input
import java.util.Scanner;

public class Exercise2 
{//name of the class
	public static void main(String[] args) 
	{// main method
		Scanner input = new Scanner(System.in); // declaring scanner

		System.out.println("Please Enter Your Mark For English:"); // promt the user for their english mark
		double english = input.nextDouble(); // store their english mark in a double variable
		
		System.out.println("Please Enter Your Mark For Math:"); // promt the user for their math mark
		double math = input.nextDouble(); // store their math mark in a double variable
		
		System.out.println("Please Enter Your Mark For Chemistary:"); // promt the user for their chem mark
		double chem = input.nextDouble(); // store their chem mark in a double variable
		
		System.out.println("Please Enter Your Mark For Computer Science:"); // promt the user for their compSci mark
		double compSci= input.nextDouble(); // store their compSci mark in a double variable

		double average = (english + math + chem + compSci)/4; // calculate the average and store it in a double variable
		
		if (average >= 95 && average <= 100) // check for A+
		{
			System.out.println("Your Average Is An A+");	
		}
		else if (average >= 90 && average < 95) // check for A
		{
			System.out.println("Your Average Is An A");
		}
		else if (average >= 85 && average <= 89) // check for A-
		{
			System.out.println("Your Average Is An A-");
		}
		else if (average >= 75 && average <= 84) // check for B
		{
			System.out.println("Your Average Is An B");
		}
		else if (average >= 65 && average <= 74) // check for C
		{
			System.out.println("Your Average Is An C");
		}
		else if (average >= 50 && average <= 64) // check for D
		{
			System.out.println("Your Average Is An D");
		}
		else if (average < 50)// check for F
		{
			System.out.println("Your Average Is An F");
		}
		else // check for wrong input
		{
			System.out.println("Wrong Mark Input");
		}
	}
}