/* If Statement Exercise 1 V1.0
 * 2020-04-16
 * Farbod M.
 * Mr. Rosenburg ICS3U1
 * This is a console based application that gives the user the amount of time between their birthday and January 1st in days and seconds
 * */


// import needed packages
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise1 
{//name of the class
	public static void main(String[] args) 
	{// main method
		Scanner input = new Scanner(System.in); // declaring scanner

		System.out.println("Please Enter Your Birthday(mm-dd):"); //prompt user for their birthday
		
		String birthday = String.format("2020-%s",input.next()); //store and format the birthday in a string variable
		
		LocalDate d1 = LocalDate.parse(birthday, DateTimeFormatter.ISO_LOCAL_DATE); // convert the birthday variable to a LocalDate Object
		LocalDate d2 = LocalDate.parse("2020-01-01", DateTimeFormatter.ISO_LOCAL_DATE); // make a LocalDate variable for January 1st
		
		Duration diff = Duration.between(d2.atStartOfDay(), d1.atStartOfDay()); // get the differnce between the 2 dates
		
		long diffDays = diff.toDays(); // convert that into days
		
		System.out.println((diffDays+1) + " Days Since January 1st And "+ ((diffDays+1)*86400) + " Seconds"); // dispaly final information about birthday
		
	}	
}
