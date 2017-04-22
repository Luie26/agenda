package agendaProject;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
// above are imports important to GUI development

public class agenda extends JFrame {
	
	private JTextField title; // textField for user to insert name of task
	private JTextField priority; // textField for user to add an integer 1-3 to determine priority range
	private JTextField duedate; // textField to enter date of when task is to be done
	private JLabel titleLbl; // label to assist user to what objects may be
	private JLabel priorityLbl; // label to accompany the priority textField
	private JLabel duedateLbl; // label to accompany the duedate textField
	
	public agenda(){
		super("Agenda");
		setLayout(new FlowLayout());
		
		titleLbl = new JLabel("Enter name of task you want to enter");
		add(titleLbl);
		title = new JTextField("Name?");
		add (title);
		// The line of code above is what is to be impletmented to the Label and TextField
		
		priorityLbl = new JLabel("Within the range of 0-3 enter how important this task is");
		add(priorityLbl);
		priority = new JTextField("0-1");
		add(priority);
		// The line of code above is what is to be impletmented to the Label and TextField

		duedateLbl = new JLabel("Enter the date fo when poject is to be done by");
		add(duedateLbl);
		duedate = new JTextField("Date");
		add(duedate);
	}
}
