import java.util.Scanner; 

public class Exercise1 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // declaring scanner

		System.out.println("Please enter the price of an item as integer"); //prompt user for the price
		int price = input.nextInt(); //store the price in the integer variable price
		if( price>=10) 
		{ //making a decision based on the task and setting a block of code to execute
			double finalprice=price*0.9; //declaring discounted price as 90% of given
			System.out.println("Your discounted price is "+finalprice);
		} // Printing discounted price and closing the block
		else 
		{ //setting else condition
			System.out.println("Your final price is "+price); //Printing non discounted price		
		} 
	}
}
