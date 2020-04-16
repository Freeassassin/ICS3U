import java.util.Scanner; //we will need the scanner for user input

public class Exercise1 
{ //name of the class
	
	public static void main(String[] args)
	{ // main method
		double finalprice; //declaring variable finalprice to store the total price
		Scanner input = new Scanner(System.in); //declaring new scanner "input"
		System.out.println("Please enter the item you want to buy "); // prompt for the item name
		String name = input.next(); //assigning value to variable "name" from user input
		System.out.println("Please input the price of item in dollars"); // prompt for the price of an item
		double price = input.nextDouble(); //assigning value to variable"price" from user input
		if (price<10.0) 
		{
			finalprice= price +2.0;
		} //first decision based on the price in regards to shipping
		else 
		{ 
			finalprice=price+3.0;// part of the same decision
		}
		System.out.println("Would you like an overnight delivery?\t Press 1 for YES"); //prompt for overnight delivery
		int choice=input.nextInt(); //assigning choice a varible from user input
		if(choice==1) 
		{
			double extraprice =finalprice+5.0; //in case 1 is chosen add 5 to the final price
			System.out.println("Invoice:"); //next 4 lines print out the answer
			System.out.println("Item: "+name);
			System.out.println("Shipping total: "+finalprice);
			System.out.println("Overall total: "+extraprice);
		}
		else 
		{
			System.out.println("Invoice:"); //next 4 lines prints out the answer
			System.out.println("Item: "+name);
			System.out.println("Shipping total: "+finalprice);
			System.out.println("Overall total: "+finalprice);
		}
	} //end of main method
} //end of class