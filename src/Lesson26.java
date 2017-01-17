import javax.swing.*;
import java.awt.event.*;

//Useful to store widths and heights
import java.awt.Dimension;

//Enable to get todays date
import java.util.Date;

//Allow to easy use spinners on dates
import javax.swing.SpinnerDateModel;

//Allow to work with dates
import java.util.Calendar;

//This allow to use JFrame objects and methods
public class Lesson26 extends JFrame{

	JButton button1;
	
	//Create 4 spinners
	JSpinner spinner1, spinner2, spinner3, spinner4;
	
	String outputString = "";
	
	public static void main(String[] args) {
		
		new Lesson26();
		
	}
	
	public Lesson26(){
	
		this.setSize(400, 400);
		
		//Shortcut to display window in the middle of the screen
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Sixth Frame");
		
		JPanel thePanel = new JPanel();
		
		//Creating a button, creating listener object, connecting listener with button, adding button to the panel
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		//--1-- Extremely basic spinner
		spinner1 = new JSpinner();
		thePanel.add(spinner1);
		
		//--2-- Start at 10, minimum 1, maximum 100, 1 click = +/- 1;
		spinner2 = new JSpinner(new SpinnerNumberModel(10, 1, 100, 1));
		thePanel.add(spinner2);
		
		//--3-- Spinner with strings; 
		String[] weekDays = {"Mon", "Tues", "Weds", "Thurs", "Fri"};
		spinner3 = new JSpinner(new SpinnerListModel(weekDays));
		
		//Allow to modify spinner3 size
		Dimension d = spinner3.getPreferredSize();
		d.width = 80;
		spinner3.setPreferredSize(d);
		
		thePanel.add(spinner3);
		
		//--4-- Spinner working with dates
		
		//Get todays date
		Date todaysDate = new Date();
		
		//Start at todays date, no minimum, no maximum, 1 click = +/- 1 day;
		spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//Allow to modify spinner4 display style
		JSpinner.DateEditor dateEditor;
		
		//Spinner to edit, standard date style;
		dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yy");
		
		//Set editor on spinner4
		spinner4.setEditor(dateEditor);
		
		thePanel.add(spinner4);
		
		
		//Add panel to Frame
		this.add(thePanel);
		
		//Make Frame visible
		this.setVisible(true);
		
	}
	
	//Class responsible for buttons, which implements ActionListener
	private class ListenForButton implements ActionListener{

		//Method which is ActionListener interface
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == button1){
				
				outputString += "Spinner 1 Value: " + spinner1.getValue() + "\n";
				outputString += "Spinner 2 Value: " + spinner2.getValue() + "\n";
				outputString += "Spinner 3 Value: " + spinner3.getValue() + "\n";
				outputString += "Spinner 4 Value: " + spinner4.getValue() + "\n";
				
				//Name of program, what to display
				JOptionPane.showMessageDialog(Lesson26.this, outputString);
			}
			
		}
		
	}
	
}
