import javax.swing.*;
import java.awt.event.*;

public class Lesson25 extends JFrame{
	
	JButton button1;
	String infoOnComponent = "";
	JScrollPane scroller;
	
	//List component
	JList favoriteMovies, favoriteColors;
	
	//List of modules which will be editable
	DefaultListModel defListModel = new DefaultListModel();
	
	public static void main(String[] args) {
		
		new Lesson25();
		
	}
	
	public Lesson25(){
		
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fifth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		//Create listener object
		ListenForButton lForButton = new ListenForButton();
		
		//On button1 use function addActionListener using object lForButton
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		//FIRST way to add items to the list
		String[] movies = {"Matrix", "Minority Report", "Big"};
		
		//Create list box and add array of strings
		favoriteMovies = new JList(movies);
		
		//Set cell constant width and height 
		favoriteMovies.setFixedCellWidth(150);
		favoriteMovies.setFixedCellHeight(30);
		
		//Able to select more than one but in order 
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		//SECOND way to add items to the list
		String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray", "Pink"};
		
		for(String color: colors){
			defListModel.addElement(color);
		}
		//Adding purple on index 2
		defListModel.add(2, "Purple");
		
		//Adding list to JList component
		favoriteColors = new JList(defListModel);
		
		//Set 4 rows visible
		favoriteColors.setVisibleRowCount(4);
		
		//Adding list to the scroller
		scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		favoriteColors.setFixedCellWidth(150);
		favoriteColors.setFixedCellHeight(30);
		
		//Adding 1 list to thePanel
		thePanel.add(favoriteMovies);
		
		//Adding scroller with list 2 to thePanel
		thePanel.add(scroller);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}
	
		//Class responsible for buttons, which implements ActionListener 
		private class ListenForButton implements ActionListener{

			//Method which is ActionListener interface
			public void actionPerformed(ActionEvent e) {
				
				//If method get action from button1
				if(e.getSource() == button1){
					
					//For example if I want to check does this list contains "Black" element
					if(defListModel.contains("Black")) infoOnComponent += "Black is Here\n";
						
					//Check isn't the list empty
					if(!defListModel.isEmpty()) infoOnComponent += "Something in Here\n";
					
					//Check size of the list
					infoOnComponent += "Elements in the List " + defListModel.size() + "\n";
					
					//Check last element on the list
					infoOnComponent += "Last Element " + defListModel.lastElement() + "\n";
					
					//Check first element on the list
					infoOnComponent += "First Element " + defListModel.firstElement() + "\n";
					
					//Element on index 1
					infoOnComponent += "In index 1 " + defListModel.get(1) + "\n";
					
					//Remove item in index 0
					defListModel.remove(0);
					
					//Remove item named "Blue"
					defListModel.removeElement("Blue");
					
					//Create array of object on the list
					Object[] arrayOfList = defListModel.toArray();
					
					//Put all object on screen in the message
					for(Object color: arrayOfList){
						infoOnComponent += color + "\n";
					}
					
					//Show message on the screen: where, text, name, icon;
					JOptionPane.showMessageDialog(Lesson25.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
					
					//Return this string to "" value
					infoOnComponent = "";
				}
				
			}
			
		}

}
