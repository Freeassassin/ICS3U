import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner

		System.out.println("Please Enter Your Birth Date(yyyy-mm-dd): "); //prompt user for the boltss
		String BirthDate = input.next();
		String CurrentDate = java.time.LocalDate.now().toString();
		LocalDate d1 = LocalDate.parse(BirthDate, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate d2 = LocalDate.parse(CurrentDate, DateTimeFormatter.ISO_LOCAL_DATE);
		Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
		long diffDays = diff.toDays();
		
		System.out.println("\nYou Are "+diffDays*86400+" Seconds Old"); //prompt user for the boltss
		
		
	}
}
