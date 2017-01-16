import javax.swing.*;
import java.awt.event.*;

public class Lesson24 extends JFrame {

	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponent = "";
	
	public static void main(String[] args) {
		
		new Lesson24();
		
	}//End of main()
	
	public Lesson24(){
		
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fourth Frame");
		
		JPanel thePanel = new JPanel();
		
		String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};
		
		favoriteShows = new JComboBox(shows);
		
		favoriteShows.addItem("House of Cards");
		
		thePanel.add(favoriteShows);
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		

		this.add(thePanel);
		
		this.setVisible(true);
		
		favoriteShows.insertItemAt("Dexter", 1);
		
		favoriteShows.setMaximumRowCount(3);
		
		favoriteShows.removeItem("Dexter");
		
	}
	
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button1){
				
				favoriteShows.setEditable(true);
				
				infoOnComponent += "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
				
				infoOnComponent += "Num of Shows: " + favoriteShows.getItemCount() + "\n";
				
				infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
				
				infoOnComponent += "Selected Value: " + favoriteShows.getSelectedItem() + "\n";
				
				infoOnComponent += "Are Editable: " + favoriteShows.isEditable() + "\n";
				
				JOptionPane.showMessageDialog(Lesson24.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = "";
			}
			
			
			
			
			
		}//End of actionPerformed()
		
	}//End of ListenForButton class
	
}//End of Lesson24 class
