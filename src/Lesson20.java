import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Lesson20 extends JFrame {
	
	public static void main(String[] args) {
		
		new Lesson20();
		
	}
	
	public Lesson20(){
		
		//Size of the Window
		this.setSize(400, 400);
		
		//Default window location; null = center 
		//this.setLocationRelativeTo(null);
		
		//Give access to toolkit methods
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//Store width and height 
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		//Set window location based on screen size
		this.setLocation(xPos, yPos);
		
		//Can user change size of the window
		this.setResizable(false);
		
		//Kill process after closing window 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Title
		this.setTitle("My First Frame");
		
		//--------------PANELS-----------------------
		
		//Creating panel
		JPanel thePanel = new JPanel();
		
		
		//---Labels---
		
		//Creating label
		JLabel label1 = new JLabel("Tell me something");
		
		//Changing text in label
		label1.setText("Hello World!");
		
		//Creating text tip
		label1.setToolTipText("Doesn't do anything");
		
		//Adding label to panel
		thePanel.add(label1);
		
		
		//--Buttons--
		
		//Creating button 
		JButton button1 = new JButton("OK");
		
		//Do I want button border?
		button1.setBorderPainted(true);
		
		//Do I want my button looks like a button
		button1.setContentAreaFilled(true);
		
		//Changing text in button
		button1.setText("To mia³o byæ Tak czy OK?");
		
		//Creating text tip
		button1.setToolTipText("This is a button");
		
		//Adding button to panel
		thePanel.add(button1);
		
		
		//---Text Fields---
		
		//Creating text field; default text, default wide
		JTextField textField1 = new JTextField("Type here", 15);
		
		//Wide of the text field
		textField1.setColumns(10);
		
		//Changing text in text field
		textField1.setText("Hello again!");
		
		//Creating text tip
		textField1.setToolTipText("This is not a button!");
		
		//Adding text field to panel
		thePanel.add(textField1);
		
		
		//---Text Area--
		
		//Creating text area; default height, wide
		JTextArea textArea1 = new JTextArea(15, 20);
		
		//Changing text in the text area
		textArea1.setText("This is for some reason very important text which has absolutly no mean xD\n");
		
		//Line wrap
		textArea1.setLineWrap(true);
		
		//Wrap don't brake words
		textArea1.setWrapStyleWord(true);
		
		//
		int numOfLines = textArea1.getLineCount();
		
		//
		textArea1.append(" number of lines: " + numOfLines);
		
		//SCROLLBARS
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//Adding text field to panel
		thePanel.add(scrollbar1);
		
		//Adding text field to panel
		thePanel.add(textArea1);
		
		
		
		//Adding panel to frame
		this.add(thePanel);
		
		
		//Visibility of the window
		this.setVisible(true);
		
		//Focus on the text field
		textArea1.requestFocus();
	}
	
}
