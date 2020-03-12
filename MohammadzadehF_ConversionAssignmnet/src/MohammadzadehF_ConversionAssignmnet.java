/*
 * Conversion Assignment v 1.5
 * Farbod Mohammadzadeh
 * Mr. Rosenburg ICS3U1
 * this a GUI based application to showcase the differences between the java object types specially the char variable and the Ascii code
 */

// import all the needed packages
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//declare the public class for this file 
public class MohammadzadehF_ConversionAssignmnet {

	// declare the private variables that work with user input
	private JFrame ConversionFrame;
	private JTextField numberTxt;
	private JTextField textTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MohammadzadehF_ConversionAssignmnet window = new MohammadzadehF_ConversionAssignmnet();
					window.ConversionFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MohammadzadehF_ConversionAssignmnet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// declare the main frame of the application and set its properties
		ConversionFrame = new JFrame();
		// set the backgrounf color to magenta
		ConversionFrame.getContentPane().setBackground(Color.MAGENTA);
		// set the resizable option to false so the application does not change size
		ConversionFrame.setResizable(false);
		ConversionFrame.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		// set the title of the application frame to Ascii Converter
		ConversionFrame.setTitle("Ascii Converter");
		// set the boundaries of the application
		ConversionFrame.setBounds(100, 100, 450, 300);
		// set the default operation for the close button on the application
		ConversionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set the layout to absolute
		ConversionFrame.getContentPane().setLayout(null);
		
		// decalre the main panel for the ascii converter
		JPanel asciiPnl = new JPanel();
		asciiPnl.setBackground(Color.RED);
		asciiPnl.setBounds(0, 0, 213, 263);
		ConversionFrame.getContentPane().add(asciiPnl);
		asciiPnl.setLayout(null);
		
		// decalre the label that dispalys the Key Title
		JLabel keyTitleLbl = new JLabel("        Key To Ascii");
		keyTitleLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		keyTitleLbl.setBounds(10, 10, 193, 37);
		asciiPnl.add(keyTitleLbl);
		
		// decalre the label that dispalys info
		JLabel infoLbl = new JLabel("Please Enter A Number");
		infoLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		infoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		infoLbl.setBounds(10, 57, 193, 14);
		asciiPnl.add(infoLbl);
		
		// decalre the label that dispalys the rest of the info
		JLabel infoContinLbl = new JLabel("Between 33 and 255");
		infoContinLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		infoContinLbl.setHorizontalAlignment(SwingConstants.CENTER);
		infoContinLbl.setBounds(10, 81, 193, 13);
		asciiPnl.add(infoContinLbl);
		
		// decalre the text feild for input to get the number
		numberTxt = new JTextField();
		numberTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		numberTxt.setBounds(63, 104, 96, 19);
		asciiPnl.add(numberTxt);
		numberTxt.setColumns(10);
		
		// decalre the label that dispalys the converted key
		JLabel convertedKeyLbl = new JLabel("");
		convertedKeyLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		convertedKeyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		convertedKeyLbl.setBounds(0, 164, 213, 19);
		asciiPnl.add(convertedKeyLbl);
		
		// declare the button that converts to key
		JButton ConvertKeyBtn = new JButton("Get Key");
		ConvertKeyBtn.addActionListener(new ActionListener() 
		{
			// set the action that  is profomred when the button gets pressed
			public void actionPerformed(ActionEvent e) 
			{
				// see if the text field has a proper number in it
				try 
				{
					int num = Integer.valueOf(numberTxt.getText());				
				} 
				catch (Exception e1)
				{
					// if there is an error the program will tell the user to input a valid number
					JOptionPane.showMessageDialog(null, "Please Enter A Number", "Error",  JOptionPane.OK_OPTION);
				}
				int num = Integer.valueOf(numberTxt.getText());
				// convert the char
				char key = (char) num;
				// display the converted key
				convertedKeyLbl.setText("The Key For Ascii Code "+num+" is: "+key);
				

			}
		});
		ConvertKeyBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		ConvertKeyBtn.setBounds(63, 133, 96, 21);
		asciiPnl.add(ConvertKeyBtn);
		
		// decalre the main panel for the key panel
		JPanel keypnl = new JPanel();
		keypnl.setBackground(Color.BLUE);
		keypnl.setBounds(223, 0, 213, 263);
		ConversionFrame.getContentPane().add(keypnl);
		keypnl.setLayout(null);
		
		// decalre the label that dispalys the ascii title
		JLabel AsciiTitleLbl = new JLabel("        Ascii To Key");
		AsciiTitleLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		AsciiTitleLbl.setBounds(10, 10, 193, 37);
		keypnl.add(AsciiTitleLbl);
		
		// decalre the label that dispalys the info for ascii conversion
		JLabel asciiInfoLbl = new JLabel("Please Enter A Character/Symbol");
		asciiInfoLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		asciiInfoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		asciiInfoLbl.setBounds(10, 57, 193, 13);
		keypnl.add(asciiInfoLbl);
		
		// decalre the text feild for input to get the Character
		textTxt = new JTextField();
		textTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		textTxt.setBounds(54, 104, 96, 19);
		keypnl.add(textTxt);
		textTxt.setColumns(10);
		
		// decalre the label that dispalys the converted key
		JLabel converterdNumLbl = new JLabel("");
		converterdNumLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		converterdNumLbl.setHorizontalAlignment(SwingConstants.CENTER);
		converterdNumLbl.setBounds(0, 164, 213, 13);
		keypnl.add(converterdNumLbl);	
		
		// declare the button that converts to ascii
		JButton convertNumBtn = new JButton("Get Ascii");
		convertNumBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// declare the key pressed
				char key = textTxt.getText().charAt(0);
				// turn into number
				int num = (int) key;
				// dispaly ascii code
				converterdNumLbl.setText("The Asccii Code For "+key+" is:"+num);
				
			}
		});
		convertNumBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		convertNumBtn.setBounds(54, 133, 96, 21);
		keypnl.add(convertNumBtn);
		

	}
}
