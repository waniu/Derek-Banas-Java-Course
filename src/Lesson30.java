import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.Date;

public class Lesson30 extends JFrame{

	JLabel nameLabel, streetLabel, stateLabel, dateLabel, ageLabel, sexLabel, optionsLabel, aboutLabel;
	JTextField nameText, streetText;
	JComboBox stateList;
	JSpinner dateSpin;
	JSlider ageSlider;
	JRadioButton maleRadio, femaleRadio;
	ButtonGroup sexGroup;
	JCheckBox morningCheck, afterNCheck, eveningCheck;
	JTextArea aboutYou;
	
	public static void main(String[] args) {
		
		new Lesson30();
	}
	
	public Lesson30(){
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Random Layout");
		
		JPanel thePanel = new JPanel();
		
		//GridBag Layout
		thePanel.setLayout(new GridBagLayout());
		
		nameLabel = new JLabel("Name:");
		addComp(thePanel, nameLabel, 0, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
		//Create textField(width = 30)
		nameText = new JTextField(30);
		addComp(thePanel, nameText, 1, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		streetLabel = new JLabel("Street:");
		addComp(thePanel, streetLabel, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
		streetText = new JTextField(30);
		addComp(thePanel, streetText, 1, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		//Box Layout
		Box sexBox = Box.createVerticalBox();
		maleRadio = new JRadioButton("Male");
		femaleRadio = new JRadioButton("Female");
		
		//Only one can be selected at the same time
		sexGroup = new ButtonGroup();
		sexGroup.add(maleRadio);
		sexGroup.add(femaleRadio);
		
		sexBox.add(maleRadio);
		sexBox.add(femaleRadio);
		//Border
		sexBox.setBorder(BorderFactory.createTitledBorder("Sex"));
		addComp(thePanel, sexBox, 3, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		//Flow Layout
		JPanel statePanel = new JPanel(); 
		
		statePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		
		stateLabel = new JLabel("State:");
		
		statePanel.add(stateLabel);
		
		String[] states = {"PA", "NY", "OH", "WV"};
		
		//Array of strings in ComboBox
		stateList = new JComboBox(states);
		statePanel.add(stateList);
		
		dateLabel = new JLabel("Appointment Date");
		statePanel.add(dateLabel);
		
		Date todaysDate = new Date();
		dateSpin = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpin, "dd/MM/yy"); 
		dateSpin.setEditor(dateEditor);
		statePanel.add(dateSpin);
		
		ageLabel = new JLabel("Age: 50");
		statePanel.add(ageLabel);
		
		ageSlider = new JSlider(10, 99, 50);
		ListenForSlider lForSlider = new ListenForSlider();
		ageSlider.addChangeListener(lForSlider);
		statePanel.add(ageSlider);
		
		addComp(thePanel, statePanel, 1, 2, 5, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
		Box optionBox = Box.createVerticalBox();
		
		morningCheck = new JCheckBox("Morning");
		afterNCheck = new JCheckBox("Afternoon");
		eveningCheck = new JCheckBox("Evening");
				
		optionBox.add(morningCheck);
		optionBox.add(afterNCheck);
		optionBox.add(eveningCheck);
		
		optionBox.setBorder(BorderFactory.createTitledBorder("Time of Day"));
		addComp(thePanel, optionBox, 1, 3, 2, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
		
		aboutYou = new JTextArea(6, 40);
		aboutYou.setText("Tell us about you");
		aboutYou.setLineWrap(true);
		aboutYou.setWrapStyleWord(true);
		
		JScrollPane scrollbar1 = new JScrollPane(aboutYou, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		addComp(thePanel, scrollbar1, 2, 3, 3, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		
		
		this.add(thePanel);
		
		//Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
		this.pack();
		
		this.setVisible(true);
		
	}//End of Lesson30()
	
	private class ListenForSlider implements ChangeListener{

		//Called when the spinner is changed
		public void stateChanged(ChangeEvent e) {
			
			//Check the source
			if(e.getSource() == ageSlider){
				
				ageLabel.setText("Age: " + ageSlider.getValue());
				
			}
			
		}
		
	}//End of ListenForSlider class
	
	private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
		
		//DEFAULT GRIDBAG CONSTRAINTS
				GridBagConstraints gridConstraints = new GridBagConstraints();
				
				//X position for every single component
				gridConstraints.gridx = xPos;
				//X position for every single component
				gridConstraints.gridy = yPos;
				
				//How many columns
				gridConstraints.gridwidth = compWidth;
				//How many rows
				gridConstraints.gridheight = compHeight;
				
				//
				gridConstraints.weightx = 100;
				gridConstraints.weighty = 100;
				
				//Padding around the components
				gridConstraints.insets = new Insets(5,5,5,5);
				
				//
				gridConstraints.anchor = place;
				
				//This will line everything up
				gridConstraints.fill = stretch;
				
				
				thePanel.add(comp, gridConstraints);
				
	}//End of addComp()
	
}//End of Lesson30 class












