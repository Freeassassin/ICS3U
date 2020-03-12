/*
 * Birthday Game V1.0
 * Farbod Mohammadzadeh
 * Mr. Rosenburg ICS3U1
 * this a GUI based application that helps the  user play a birthday game
 */

// import all the needed packages
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Label;


//declare the public class for this file 
public class MohammadzadehF_BirthdayGameAssignment {
	// declare the private variables that work with user input
	private JFrame birthdayGameFrame;
	private JTextField bDayNumTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MohammadzadehF_BirthdayGameAssignment window = new MohammadzadehF_BirthdayGameAssignment();
					window.birthdayGameFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MohammadzadehF_BirthdayGameAssignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{ 	
		birthdayGameFrame = new JFrame();
		birthdayGameFrame.getContentPane().setBackground(Color.MAGENTA);
		birthdayGameFrame.setResizable(false);
		birthdayGameFrame.setBounds(100, 100, 675, 450);
		birthdayGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		birthdayGameFrame.getContentPane().setLayout(null);
		// declare the lable that dispalys the title
		JLabel titleLbl = new JLabel("Welcome To The Birthday Game");
		titleLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setBounds(0, 0, 671, 62);
		birthdayGameFrame.getContentPane().add(titleLbl);
		// declare the Text area that holds the instructions
		JTextPane infoTxt = new JTextPane();
		infoTxt.setBackground(Color.BLUE);
		infoTxt.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		infoTxt.setText("1- Determine your birth month (January = 1, February = 2 \u2026.) \r\n2- Multiply that number by 5  \r\n3- Add 6 to that number\t\r\n4- Multiply the number by 4\r\n5- Add 9 to the number \r\n6- Multiply that number by 5\r\n7- Add your birthday to the number (10 if born on the 10th and so on) ");
		infoTxt.setEditable(false);
		infoTxt.setBounds(10, 106, 651, 182);
		birthdayGameFrame.getContentPane().add(infoTxt);
		// declare the label that diplays instructions
		JLabel infoLbl = new JLabel("Instructions:");
		infoLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		infoLbl.setBounds(10, 72, 155, 24);
		birthdayGameFrame.getContentPane().add(infoLbl);		
		// declare the label that intrucs to input the birthday number
		JLabel bDayNumLbl = new JLabel("Enter Your Birthday Number!");
		bDayNumLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		bDayNumLbl.setBounds(10, 304, 233, 24);
		birthdayGameFrame.getContentPane().add(bDayNumLbl);
		// declare the text area that recives the birthday number
		bDayNumTxt = new JTextField();
		bDayNumTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		bDayNumTxt.setBounds(253, 304, 96, 24);
		birthdayGameFrame.getContentPane().add(bDayNumTxt);
		bDayNumTxt.setColumns(10);
		// declare the label that will hold the birth date (month and day)
		JLabel bDayLbl = new JLabel("");
		bDayLbl.setIcon(null);
		bDayLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		bDayLbl.setBounds(10, 338, 445, 32);
		birthdayGameFrame.getContentPane().add(bDayLbl);		
		// declare the button that calculates the birth date  (month and day)
		JButton bDayCalculateBtn = new JButton("Get Birthday");
		bDayCalculateBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		bDayCalculateBtn.addActionListener(new ActionListener() 
		{
			// declare the actions that the button preforms after being pressed
			public void actionPerformed(ActionEvent e) 
			{
				// see if the text fields have proper numbers in them 
				try 
				{
					double bDayNum = Double.valueOf(bDayNumTxt.getText());				
				} 
				catch (Exception e1)
				{
					// if there is an error the program will tell the user to input a valid number
					JOptionPane.showMessageDialog(null, "Please Enter A Number", "Error",  JOptionPane.OK_OPTION);
				}
				// callculate the birthday number 
				double bDayNum = (Double.valueOf(bDayNumTxt.getText())- 165)/100;
				//calculate the birthday month
				int month = (int) bDayNum;
				// calculate the birth day
				int day = (int) ((bDayNum*100)%(month*100)); 
				// dispaly the birthdate in a label
				bDayLbl.setText("Your Birth Month Is: "+month+" And Your Birth Day Is: "+ day);
				
				
				
			}
		});
		bDayCalculateBtn.setBounds(359, 304, 132, 24);
		birthdayGameFrame.getContentPane().add(bDayCalculateBtn);
		// declare the  that 
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MohammadzadehF_BirthdayGameAssignment.class.getResource("/images/download.jpg")));
		lblNewLabel.setBounds(20, 330, 104, 82);
		birthdayGameFrame.getContentPane().add(lblNewLabel);
		
/*
 * Write a program that creates an integer variable: length and asks the user for the length of a movie in minutes then outputs the price of the movie as a double. The movie costs 25 cents for every minute.

Indicate the output of the following piece of code:
class Main {
public static void main(String[] args) {
String name = "Bob";
int trees = 3;
int flowers = 10;
int plants = trees + flowers;
String quote = "Hello";
System.out.print(name + " has " + trees + " trees"); System.out.println(" and " + flowers + " flowers,\n" + plants + " plants in total.");
System.out.println(name + " says \"" + quote + ".\""); }
}

Write a program with an integer variable: apples and another integer variable: applesPerBasket. The program should ask the user for a number of apples and tell them how many baskets they can fill. Every basket can fit 5 apples. The program should also tell the user how many more apples are needed to fill another basket if there are still apples left over. If there are no apples left over, the program should say that the user needs 5 more apples to fill another basket.

Write a program that will ask the user for the length width and height of a rectangular prism and outputs the surface area and the volume of the prism.

Write a program to reverse any 3-digit number. For example an input of “321” results in an output of “123”.


Write a program that prompts the user for two numbers, being the numerator and denominator of the fraction. It should output the fraction, then if it is an improper fraction it should output the result, then the result as a mixed fraction. For example, if the input is 7 and 4, the output should be 7/4 is equal to 1 ¾

Here is a code fragment asking the user for some information about their debit card to order online groceries. Indicate what needs to be written in the three missing spaces.
import java.util.*;
class Main {
public static void main(String[] args) {
Scanner puppies = new Scanner(System.in);
long creditCardNumber;
String firstName;
char lastName;
System.out.println("Please enter your first name");
firstName = 1)______________________________
System.out.println("Next entre the first letter of your last name");
lastName = 2)_______________________________
System.out.println("Finally entre the frist 4 digits of your credit card number");
creditCardNumber = 3)________________________ } }

What will this code printout? Also, what is the word final used for?
import java.util.*;
class Main {
public static void main(String[] args) {
Scanner piglettes = new Scanner(System.in);
final int a = 4;
final int b = 3;
double hypotenuse;
hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); System.out.println(hypotenuse);
} }

*
*Scanner type:

import java.util.Scanner;
public class print {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Please enter your name");
String name=input.next();
System.out.println("PLease enter a number");
Float money=input.nextFloat();
money*=2;
System.err.println("Hello "+name+" You owe me " +money+ " Dollars!!!");
}

}
*
*/
		}
}
