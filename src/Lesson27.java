import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

//Library which allows to work with enumeration
import java.util.Enumeration;

//I think it's a mistake in tutorial so I'll left it in the comment
import javax.swing.tree.*;

public class Lesson27 extends JFrame{

	JButton button1;
	String outputString = "";
	
	//Define tree component
	JTree theTree;
	
	//Creating nodes = folders
	DefaultMutableTreeNode documents, work, games, emails;
	
	//The root node
	DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");
	
	public static void main(String[] args) {
		
		new Lesson27();
	}
	
	public Lesson27(){
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("My Seventh Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		//Create tree component
		theTree = new JTree(fileSystem);
		
		//Method to able to select only 1 path at the time
		theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		//To make 8 nodes visible
		theTree.setVisibleRowCount(8);
		
		//Adding subNode to the tree using separate method
		//It's a parentNode to
		documents = addAFile("Docs", fileSystem);
		
		//Adding files to folder
		addAFile("Taxes.exl", documents);
		addAFile("Story.txt", documents);
		
		emails = addAFile("Emails", documents);
		addAFile("Schedule.txt", emails);
		
		work = addAFile("Work Applications", fileSystem);
		addAFile("Spreadsheet.exe", work);
		addAFile("Wordprocessor.exe", work);
		
		games = addAFile("Games", fileSystem);
		addAFile("SpaceInvaders.exe", games);
		addAFile("PacMan.exe", games);
		
		//Create scroll_bar with theTree inside
		JScrollPane scrollBox = new JScrollPane(theTree);
		//Upload default size of the scrollBox to d
		Dimension d = scrollBox.getPreferredSize();
		//Change width of d on 200
		d.width = 200;
		//Set new size to scrollBox
		scrollBox.setPreferredSize(d);
		
		thePanel.add(scrollBox);
		
		
		this.add(thePanel);
		this.setVisible(true);
		
	}//End of Lesson27()
	
	
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button1){
			
				//Get whatever node was selected
				Object treeObject = theTree.getLastSelectedPathComponent();
				//Casting object to DefaultMutableTreeNode
				DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;
				//Casting object to String
				String treeNode = (String) theFile.getUserObject();
				
				//Names just speak for themselves 
				outputString += "The Selected Node: " + treeNode + "\n";
				outputString += "Number of Children : " + theFile.getChildCount() + "\n";
				outputString += "Number of Siblings: " + theFile.getSiblingCount() + "\n";
				outputString += "Parent Name: " + theFile.getParent() + "\n";
				outputString += "Next Node Name: " + theFile.getNextNode() + "\n";
				outputString += "Previous Node Name: " + theFile.getPreviousNode() + "\n";
				
				outputString += "\nChildren of Node\n";
				//Enumeration
				for(Enumeration enumValue = theFile.children(); enumValue.hasMoreElements();){
					
					outputString += enumValue.nextElement() + "\n";
				}
				
				outputString += "\nPath From Root\n";
				TreeNode[] pathNodes = theFile.getPath();
				for(TreeNode indivNodes: pathNodes){
					
					outputString += indivNodes + "\n";
				}
				
				JOptionPane.showMessageDialog(Lesson27.this, outputString);
				
				outputString = "";
			}
		}
		
	}//End of ListenForButton class
	
	
	//This one have to long data type =) 
	//Take newNode name and parent
	private DefaultMutableTreeNode addAFile(String fileName, DefaultMutableTreeNode parentFolder){
		
		//Create newNode
		DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
		
		//Add newNode to parent folder
		parentFolder.add(newFile);
		
		return newFile;
		
	}//End of addAFile()
	
}//End of Lesson27 class



















