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
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.Label;
import java.awt.SystemColor;


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
		// declare the label that holds the image
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setLabelFor(birthdayGameFrame);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(MohammadzadehF_BirthdayGameAssignment.class.getResource("/images/download.jpg")));
		lblNewLabel.setBounds(497, 298, 164, 114);
		birthdayGameFrame.getContentPane().add(lblNewLabel);
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

		
		
		
		
		}
}
