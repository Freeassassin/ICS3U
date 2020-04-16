import java.util.Scanner; //we will need the scanner for user input

public class Exercise4 
{ //name of the class
	
	public static void main(String[] args)
	{ // main method
		Scanner input = new Scanner(System.in); //declaring new scanner "input"
		
		System.out.println("Please Enter Your Characters Name: ");
		String name = input.next();
		
		System.out.println("Please Enter Strength (1-10): ");
		int strength = input.nextInt();
		
		System.out.println("Please Enter Health (1-10): ");
		int health = input.nextInt();
		
		System.out.println("Please Enter Luck (1-10): ");
		int luck = input.nextInt();
		
		int total = strength + health +luck;
		
		if(total < 15 ) 
		{
			System.out.println("Values Assigned: "+ name + " Strength: "+ strength + " Health: "+ health+" Luck: "+luck);			
		}
		else 
		{
			System.out.println("You have give your character too many points!");
			System.out.println("DeFault Values Assigned: "+ name + " Strength: 5 Health: 5 Luck: 5");
		}
	}
}
