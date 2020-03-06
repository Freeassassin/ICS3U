/*
 * Variables GUI v 1.5
 * Farbod Mohammadzadeh
 * Mr. Rosenburg ICS3U1
 * this a GUI based application to showcase the differences between the java object types in with user interaction
 */

// import all the needed packages
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

// declare the public class for this file 
public class MohammadzadehF_VariablesGUIAssignmnet {
	
	// declare the private variables that work with user input
	private JFrame variablesGUIFrame;
	private JTextField widthTxt;
	private JTextField lengthTxt;
	private JTextField priceTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MohammadzadehF_VariablesGUIAssignmnet window = new MohammadzadehF_VariablesGUIAssignmnet();
					window.variablesGUIFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MohammadzadehF_VariablesGUIAssignmnet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		// declare the main frame of the application and set its properties
		variablesGUIFrame = new JFrame();
		// set the resizable option to false so the application does not change size
		variablesGUIFrame.setResizable(false);
		// set the title of the application frame to Geometry and Tax Caclculator
		variablesGUIFrame.setTitle("Geometry And Tax Calculator");
		// set the boundaries of the application
		variablesGUIFrame.setBounds(100, 100, 450, 300);
		// set the default operation for the close button on the application
		variablesGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set the layout to absolute
		variablesGUIFrame.getContentPane().setLayout(null);
		
		// decalre the main panel for the geometry calculator
		JPanel geometryPnl = new JPanel();
		geometryPnl.setBackground(Color.RED);
		geometryPnl.setBounds(0, 0, 213, 263);
		variablesGUIFrame.getContentPane().add(geometryPnl);
		geometryPnl.setLayout(null);
		
		// decalre the text feild for input to get the width 
		widthTxt = new JTextField();
		widthTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		widthTxt.setBounds(36, 63, 96, 19);
		geometryPnl.add(widthTxt);
		widthTxt.setColumns(10);
		
		// decalre the  label that dispalys width 
		JLabel widthLbl = new JLabel("Width");
		widthLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		widthLbl.setBounds(36, 40, 45, 13);
		geometryPnl.add(widthLbl);
		
		//decalre the  label that dispalys length
		JLabel lengthLbl = new JLabel("Length");
		lengthLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		lengthLbl.setBounds(36, 92, 45, 13);
		geometryPnl.add(lengthLbl);
		
		//decalre the text feild for input to get the length
		lengthTxt = new JTextField();
		lengthTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		lengthTxt.setBounds(36, 115, 96, 19);
		geometryPnl.add(lengthTxt);
		lengthTxt.setColumns(10);

		// decalre the label that shows the output of the program or the area/perimeter 
		JLabel geometryLbl = new JLabel("");
		geometryLbl.setBounds(0, 206, 213, 13);
		geometryPnl.add(geometryLbl);		

		// decalre the combo box that holds the different types of units
		JComboBox unitComboBox = new JComboBox();
		unitComboBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		unitComboBox.setModel(new DefaultComboBoxModel(new String[] {"MM", "CM", "M"}));
		unitComboBox.setSelectedIndex(1);
		unitComboBox.setBounds(142, 62, 50, 21);
		geometryPnl.add(unitComboBox);		
		
		// declare the button that calculates the area
		JButton areaCalculateBtn = new JButton("Calculate Area");
		areaCalculateBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		areaCalculateBtn.addActionListener(new ActionListener() 
		{
			// set the action that  is profomred when the button gets pressed
			public void actionPerformed(ActionEvent e) 
			{
				// see if the text fields have proper numbers in them 
				try 
				{
					double width = Double.valueOf(widthTxt.getText());
					double length = Double.valueOf(lengthTxt.getText());					
				} 
				catch (Exception e1)
				{
					// if there is an error the program will tell the user to input a valid number
					JOptionPane.showMessageDialog(null, "Please Enter A Number", "Error",  JOptionPane.OK_OPTION);
				}
				double width = Double.valueOf(widthTxt.getText());
				double length = Double.valueOf(lengthTxt.getText());
				// ccalculate the area
				float area = (float) (length*width);
				// display the area 
				geometryLbl.setText("The Area is: "+ area+" "+unitComboBox.getSelectedItem()+"^2");
			}
		});
		areaCalculateBtn.setBounds(36, 144, 118, 21);
		geometryPnl.add(areaCalculateBtn);
		
		// declare the button for calculatiing the perimeter
		JButton perimeterCalculateBtn = new JButton("Calculate Perimeter");
		perimeterCalculateBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		perimeterCalculateBtn.addActionListener(new ActionListener() 
		{
			// set the actions that are preformed when the button is pressed 
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					// check if valid numbers have been inputed
					double width = Double.valueOf(widthTxt.getText());
					double length = Double.valueOf(lengthTxt.getText());					
				} 
				catch (Exception e1)
				{
					// if not show a message that say to input valid numbers
					JOptionPane.showMessageDialog(null, "Please Enter A Number", "Error",  JOptionPane.OK_OPTION);
				}				
				double width = Double.valueOf(widthTxt.getText());
				double length = Double.valueOf(lengthTxt.getText());
				// calculate the periemeter
				float perimeter = (float) (2*(length+width));
				// dispaly the perimeter 
				geometryLbl.setText("The Perimeter is: "+ perimeter+" "+unitComboBox.getSelectedItem());				
			}
		});
		perimeterCalculateBtn.setBounds(36, 175, 150, 21);
		geometryPnl.add(perimeterCalculateBtn);
		
		// decalre the label that holds the title of the gemometry calculator
		JLabel geometryTitleLbl = new JLabel("Geometry Calculator");
		geometryTitleLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		geometryTitleLbl.setBounds(36, 10, 156, 31);
		geometryPnl.add(geometryTitleLbl);
		
		// dedcalre the main panel for the tax calculator 
		JPanel taxPnl = new JPanel();
		taxPnl.setBackground(Color.GREEN);
		taxPnl.setBounds(213, 0, 223, 263);
		variablesGUIFrame.getContentPane().add(taxPnl);
		taxPnl.setLayout(null);
		
		// decalre the title label for thetax calculator 
		JLabel taxTitleLbl = new JLabel("Tax Calculator");
		taxTitleLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		taxTitleLbl.setBounds(32, 10, 166, 29);
		taxPnl.add(taxTitleLbl);
		
		// decalre the price label for the tax calculator 
		JLabel priceLbl = new JLabel("Price");
		priceLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		priceLbl.setBounds(32, 39, 45, 13);
		taxPnl.add(priceLbl);
		
		// decslare the 13% tax label
		JLabel HSTLbl = new JLabel("HST (13%)");
		HSTLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		HSTLbl.setBounds(32, 73, 63, 13);
		taxPnl.add(HSTLbl);
		
		// decalre the total display label
		JLabel totalTxt = new JLabel("Total");
		totalTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		totalTxt.setBounds(32, 115, 45, 13);
		taxPnl.add(totalTxt);
		
		// declare the tax label 
		JLabel taxLbl = new JLabel("$0.00");
		taxLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		taxLbl.setBounds(117, 73, 106, 13);
		taxPnl.add(taxLbl);
		
		// declare the taxed total lable 
		JLabel taxTotalLbl = new JLabel("$0.00");
		taxTotalLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		taxTotalLbl.setBounds(117, 115, 106, 13);
		taxPnl.add(taxTotalLbl);
		
		// decalre the text box for the price of the object
		priceTxt = new JTextField();
		priceTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		priceTxt.setBounds(117, 36, 96, 19);
		taxPnl.add(priceTxt);
		priceTxt.setColumns(10);
		
		// decelare the button for the calulation of the taxes and total
		JButton totalCalculateBtn = new JButton("Calculate Total");
		totalCalculateBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		totalCalculateBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//set the action for the calculate button
				try 
				{
					// check if the price is a valid number
					double price = Double.valueOf(priceTxt.getText());
				} 
				catch (Exception e1)
				{
					// if it is not tell the user to input a valid number 
					JOptionPane.showMessageDialog(null, "Please  Enter A Number", "Error",  JOptionPane.OK_OPTION);
				}
				double price = Double.valueOf(priceTxt.getText());
				//calculate the HST
				float HST = (float) (price*0.13);
				// calculate the Total
				float total = (float) (price*1.13);
				// display the tax and toal
				taxLbl.setText("$"+HST);
				taxTotalLbl.setText("$"+total);
			}
		});
		totalCalculateBtn.setBounds(47, 154, 125, 21);
		taxPnl.add(totalCalculateBtn);
	}
}
