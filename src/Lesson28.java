import javax.swing.*;
import java.awt.Dimension;

//Layout libraries 
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Lesson28 extends JFrame{
	
	JButton button1, button2, button3, button4, button5;

	public static void main(String[] args) {
		
		new Lesson28();
	}
	
	public Lesson28(){
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Eighth Frame");
		
		//---FLOW LAYOUT--- 	<- default layout
		
		JPanel thePanel = new JPanel();
		/*
		//Every component automatically adjust to the lest; 80 pixels horizontal gap between buttons; 20 pixels vertical gap(no important in this example)  
		thePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 20));
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		
		thePanel.add(button1);
		thePanel.add(button2);
		*/
		//---BORDER LAYOUT---
		/*
		//Set layout to BorderLayout
		thePanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
		JPanel thePanel2 = new JPanel();
		
		thePanel2.add(button1);
		thePanel2.add(button2);
		
		//Adding thePanel2 with 2 buttons to NORTH part 
		thePanel.add(thePanel2, BorderLayout.NORTH);
		thePanel.add(button3, BorderLayout.EAST);
		thePanel.add(button4, BorderLayout.CENTER);
		thePanel.add(button5, BorderLayout.WEST);
		*/
		
		//---BOX LAYOUT---
		
		//Creation of the horizontal box
		Box theBox = Box.createHorizontalBox();
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
		theBox.add(button1);
		
		//Create 5 pixel horizontal gap between buttons
		theBox.add(Box.createHorizontalStrut(5));
		theBox.add(button2);
		
		//Create horizontal and vertical(not important in this example) space
		theBox.add(Box.createRigidArea(new Dimension(30, 20)));
		theBox.add(button3);
		
		//Stick button3 to the right side
		theBox.add(Box.createHorizontalGlue());
		theBox.add(button4);
		
		
		
		//Adding theBox to the Frame
		this.add(theBox);
		
		
		
		
		
		//Box layout doesn't use it
		//this.add(thePanel);
		this.setVisible(true);
		
	}//End of Lesson28()
	
}//End of Lesson28 class


















