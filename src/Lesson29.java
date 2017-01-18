import javax.swing.*;

//Rules how the components are display
import java.awt.GridBagConstraints;

//GridBag layout library
import java.awt.GridBagLayout;

//Grid layout library
import java.awt.GridLayout;

//Allow to use padding
import java.awt.Insets;

//Fonts library
import java.awt.Font;

public class Lesson29 extends JFrame{
	
	JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but0,
		butPlus, butMinus, clearAll;
	
	JTextField textResult;
	
	public static void main(String[] args) {
		
		new Lesson29();
	}
	
	public Lesson29(){
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		JPanel thePanel = new JPanel();
		
		//---GRID LAYOUT---
		
		/*
		//Create GridLeyout(number of rows (0 = how many U can), columns, horizontal gap, vertical gap)
		thePanel.setLayout(new GridLayout(0, 3, 5, 5));
		
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		butPlus = new JButton("+");
		but0 = new JButton("0");
		butMinus = new JButton("-");
		
		//Adding buttons to GridLayout
		thePanel.add(but1);
		thePanel.add(but2);
		thePanel.add(but3);
		thePanel.add(but4);
		thePanel.add(but5);
		thePanel.add(but6);
		thePanel.add(but7);
		thePanel.add(but8);
		thePanel.add(but9);
		thePanel.add(butPlus);
		thePanel.add(but0);
		thePanel.add(butMinus);
		*/
		
		//---GRIDBAG LAYOUT---
		
		thePanel.setLayout(new GridBagLayout());
		
		//DEFAULT GRIDBAG CONSTRAINTS
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		//X position for every single component
		gridConstraints.gridx = 1;
		//X position for every single component
		gridConstraints.gridy = 1;
		
		//How many columns
		gridConstraints.gridwidth = 1;
		//How many rows
		gridConstraints.gridheight = 1;
		
		//
		gridConstraints.weightx = 50;
		//
		gridConstraints.weighty = 100;
		
		//Padding around the components
		gridConstraints.insets = new Insets(5,5,5,5);
		
		//
		gridConstraints.anchor = GridBagConstraints.CENTER;
		
		//This will line everything up
		gridConstraints.fill = GridBagConstraints.BOTH;
		
		
		//Create TextField; default string = 0; width = matching;
		textResult = new JTextField("0", 0);
		
		
		//FONT CHANGE
		//Create new font object(font, style, size)
		Font font = new Font("Helvetica", Font.PLAIN, 18);
		//Adding font to the component
		textResult.setFont(font);
		
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		butPlus = new JButton("+");
		but0 = new JButton("0");
		butMinus = new JButton("-");
		clearAll = new JButton("C");
		
		//Adding buttons to GridBagLayout
		thePanel.add(clearAll, gridConstraints);
		gridConstraints.gridwidth = 200;
		gridConstraints.gridx = 5;
		
		thePanel.add(textResult, gridConstraints);
		gridConstraints.gridwidth = 1;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		
		thePanel.add(but1, gridConstraints);
		gridConstraints.gridx = 5;
		
		thePanel.add(but2, gridConstraints);
		gridConstraints.gridx = 9;
		
		thePanel.add(but3, gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		
		thePanel.add(but4, gridConstraints);
		gridConstraints.gridx = 5;
		
		thePanel.add(but5, gridConstraints);
		gridConstraints.gridx = 9;
		
		thePanel.add(but6, gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		
		thePanel.add(but7, gridConstraints);
		gridConstraints.gridx = 5;
		
		thePanel.add(but8, gridConstraints);
		gridConstraints.gridx = 9;
		
		thePanel.add(but9, gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		
		thePanel.add(butPlus, gridConstraints);
		gridConstraints.gridx = 5;
		
		thePanel.add(but0, gridConstraints);
		gridConstraints.gridx = 9;
		
		thePanel.add(butMinus, gridConstraints);
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.add(thePanel);
		this.setVisible(true);
		
	}//End of Lesson29()

}//End of Lesson29 class
















