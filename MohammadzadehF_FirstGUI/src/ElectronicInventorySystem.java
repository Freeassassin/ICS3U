/*
 * First GUI Assignment v 1.0
 * Farbod Mohammadzadeh
 * 2020-02-26
 * Mr. Rosenberg ICS3U1
 * This is a program to showcase an e-inventory application using Java GUI
 */


// Import all needed packages for Java GUI 

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
// the public class that holds the entire code
public class ElectronicInventorySystem {
    // declare element variables
	private JFrame frmGUI;
	private JTextField itmModelTxt;
	private JTextField itmDescTxt;
	private JTextField itmNumTxt;
	private JTextField itmCostTxt;
	private JTextField imtQuantityTxt;

	/**
	 * Launch the application.
	 * using the main method
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ElectronicInventorySystem window = new ElectronicInventorySystem();
					window.frmGUI.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ElectronicInventorySystem() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		// declare the application frame 
		frmGUI = new JFrame();
		// don't let the frame get resize
		frmGUI.setResizable(false);
		// set the font to Comic Sans
		frmGUI.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		// set the title of the application frame
		frmGUI.setTitle("Electronic Inventory System");
		// set layout to absolute
		frmGUI.getContentPane().setLayout(null);
		// set the frame title
		frmGUI.setSize(630,300);
		
		// declare the top panel and its properties
		JPanel topPnl = new JPanel();
		topPnl.setBounds(0, 0, 618, 71);
		topPnl.setBackground(Color.ORANGE);
		frmGUI.getContentPane().add(topPnl);
		topPnl.setLayout(null);
		
		// declare the title lable
		JLabel titleLbl = new JLabel("E-Inventory");
		titleLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 27));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setBounds(222, 26, 182, 35);
		topPnl.add(titleLbl);
		
		// declare the middle panel and its properties
		JPanel middlePnl = new JPanel();
		middlePnl.setBounds(0, 71, 618, 97);
		middlePnl.setBackground(Color.PINK);
		frmGUI.getContentPane().add(middlePnl);
		middlePnl.setLayout(null);
		
		// declare the item number label and its properties
		JLabel itmNumLbl = new JLabel("Item #:");
		itmNumLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmNumLbl.setBounds(10, 10, 45, 13);
		middlePnl.add(itmNumLbl);
		
		// declare the description label and its properties
		JLabel itmDescLbl = new JLabel("Item Desc:");
		itmDescLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmDescLbl.setBounds(243, 10, 119, 13);
		middlePnl.add(itmDescLbl);
		
		// declare the cost label and its properties
		JLabel itmCostLbl = new JLabel("Item Cost:");
		itmCostLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmCostLbl.setBounds(10, 43, 75, 13);
		middlePnl.add(itmCostLbl);
		
		JLabel itmModelLbl = new JLabel("Item Model:");
		itmModelLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmModelLbl.setBounds(243, 74, 75, 13);
		middlePnl.add(itmModelLbl);
		
		// declare the item type label and its properties
		JLabel itmTypeLbl = new JLabel("Item Type:");
		itmTypeLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmTypeLbl.setBounds(243, 43, 90, 13);
		middlePnl.add(itmTypeLbl);
		
		// declare the item quantity label and its properties
		JLabel itmQuantityLbl = new JLabel("Item Quantity:");
		itmQuantityLbl.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmQuantityLbl.setBounds(10, 74, 104, 13);
		middlePnl.add(itmQuantityLbl);
		
		// declare item type combo box and its properties
		JComboBox itmTypeComboBox = new JComboBox();
		itmTypeComboBox.setModel(new DefaultComboBoxModel(new String[] {"TV ", "DVD", "PC", "Laptop", "PS4", "Xbox One", "Nintendo Switch"}));
		itmTypeComboBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmTypeComboBox.setBounds(314, 39, 96, 21);
		middlePnl.add(itmTypeComboBox);
		
		// declare the item model text box and its properties
		itmModelTxt = new JTextField();
		itmModelTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmModelTxt.setBounds(314, 71, 96, 19);
		middlePnl.add(itmModelTxt);
		itmModelTxt.setColumns(10);
		
		// declare the item description text box and its properties
		itmDescTxt = new JTextField();
		itmDescTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmDescTxt.setBounds(314, 7, 96, 26);
		middlePnl.add(itmDescTxt);
		itmDescTxt.setColumns(10);
		
		// declare the item number text box and its properties
		itmNumTxt = new JTextField();
		itmNumTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmNumTxt.setBounds(93, 7, 96, 19);
		middlePnl.add(itmNumTxt);
		itmNumTxt.setColumns(10);
		
		// declare the item cost text box and its properties
		itmCostTxt = new JTextField();
		itmCostTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		itmCostTxt.setBounds(93, 40, 96, 19);
		middlePnl.add(itmCostTxt);
		itmCostTxt.setColumns(10);
		
		// declare the item quantity text box and its properties
		imtQuantityTxt = new JTextField();
		imtQuantityTxt.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		imtQuantityTxt.setBounds(93, 71, 96, 19);
		middlePnl.add(imtQuantityTxt);
		imtQuantityTxt.setColumns(10);
		
		// declare the item for sale check box and its properties
		JCheckBox forSaleCheckBox = new JCheckBox("For Sale");
		forSaleCheckBox.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		forSaleCheckBox.setBounds(457, 39, 93, 21);
		middlePnl.add(forSaleCheckBox);
		
		// declare the button panel and its properties
		JPanel buttonPnl = new JPanel();
		buttonPnl.setBounds(0, 166, 618, 97);
		buttonPnl.setBackground(Color.BLUE);
		frmGUI.getContentPane().add(buttonPnl);
		buttonPnl.setLayout(null);
		
		//  declare the save button and its properties
		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new ActionListener() 
		{
			// declare the actions of this button
			public void actionPerformed(ActionEvent e) 
			{
				BufferedWriter output = null;
				try { 
					// check if the for sale box has been ticked
					String forsale = "";
					if(forSaleCheckBox.isSelected())
					{
						forsale = "for sale";
					}else 
					{
						forsale = "not for sale";
					}
				    File file = new File("itemsData.txt"); 
				     output = new BufferedWriter(new FileWriter(file, true));     
				     output.write("Item Quantity: "+imtQuantityTxt.getText()+ ", Item Cost: " + itmCostTxt.getText()+ ", Item Model: " + itmModelTxt.getText() + ", Item Number" + itmNumTxt.getText()+ ", Item Description" + itmDescTxt.getText() + ", Item Type: " + itmTypeComboBox.getSelectedItem()+", Item is "+ forsale); 
				     output.newLine();
				
					} 
				catch (IOException e1) 
				{
						// TODO Auto-generated catch block
						e1.printStackTrace(); 
				}
				finally 
				{
				    	if ( output != null ) 
				    	{ 
				           	try 
				           	{ 
				           		output.close(); 
				           	}//end try
				    catch ( IOException e1 )
				           	{ 
				    			e1.printStackTrace(); 
				           	} //end catch
				    	}//end if 
				}//end finally
			}
		});
		saveBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		saveBtn.setBackground(Color.GREEN);
		saveBtn.setBounds(272, 20, 131, 51);
		buttonPnl.add(saveBtn);
		
		// declare the update button and its properties
		JButton updateBtn = new JButton("Update Item");
		updateBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// declare the buttons actions
				System.out.println("The Item Cost is: "+ itmCostTxt.getText());
				System.out.println("The Item Model is: "+ itmModelTxt.getText());
				System.out.println("The Item Number is: "+ itmNumTxt.getText());
				System.out.println("The Item Description is: "+ itmDescTxt.getText());
				System.out.println("The Item Quantity is: "+ imtQuantityTxt.getText());
				System.out.println("The Item Is: " + itmTypeComboBox.getSelectedItem());
				if(forSaleCheckBox.isSelected()) 
				{
					System.out.println("The Item Is For Sale");
				}else
				{
					System.out.println("The Item Is Not For Sale");
				}
			}
		});
		updateBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		updateBtn.setBackground(Color.MAGENTA);
		updateBtn.setBounds(0, 10, 131, 42);
		buttonPnl.add(updateBtn);
		
		// declare the new item button
		JButton newBtn = new JButton("New Item");
		newBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// declare the buttons action
				// set all the fields to empty
				itmCostTxt.setText("");
				imtQuantityTxt.setText("");
				itmModelTxt.setText("");
				itmNumTxt.setText("");
				itmDescTxt.setText("");
				itmTypeComboBox.setSelectedIndex(0);
				forSaleCheckBox.setSelected(false);
			}
		});
		newBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		newBtn.setBackground(new Color(204, 102, 51));
		newBtn.setBounds(0, 53, 131, 44);
		buttonPnl.add(newBtn);
		
		// declare the delete button and its properties
		JButton deleteBtn = new JButton("Delete Item");
		deleteBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// declare the delete buttons action
				// empty the text file
				BufferedWriter output = null;
				try { 
				    File file = new File("itemsData.txt"); 
				     output = new BufferedWriter(new FileWriter(file));     
				           output.write(""); 
				           output.newLine();
				} //end try=
				catch ( IOException e1 ) { 



				    e1.printStackTrace(); 
				} //end catch
				finally { 
				    	if ( output != null ) { 
				       	try { 
				output.close(); 
				}//end try
				catch ( IOException e1 ) { 
				e1.printStackTrace(); 
				} //end catch
				}//end if 
				}//end finally

			}
		});
		deleteBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		deleteBtn.setBackground(Color.YELLOW);
		deleteBtn.setBounds(131, 10, 131, 42);
		buttonPnl.add(deleteBtn);
		
		// declare the exit button and its properties
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// declare the actions of thee button
				if  (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit!",  JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exitBtn.setActionCommand("Exit");
		exitBtn.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		exitBtn.setBackground(Color.RED);
		exitBtn.setBounds(131, 53, 131, 44);
		buttonPnl.add(exitBtn);
	}

}
