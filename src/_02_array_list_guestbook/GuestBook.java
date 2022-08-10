package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	//WTF NONE OF MY CODE SAVED FUUUU time to start over
	JFrame frame = new JFrame("Guest Book");
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewNames = new JButton("View Names");
	public static void main(String[] args) {
	new GuestBook().hi();
	
	}
	public void hi() {
		frame.add(panel);
		frame.setSize(500, 500);
		panel.add(addName);
		addName.addActionListener(this);
		panel.add(viewNames);
		viewNames.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		if(addName == buttonClicked) {
			String name = JOptionPane.showInputDialog("Enter a name:");
			if(viewNames == buttonClicked) {
				ArrayList<String> list = new ArrayList<String>();
				
				list.add("Bob Banders");
				list.add(name);
				list.add("Sandy Summers");
				list.add("Greg Ganders");
				list.add("Donny Doners");
			}
		}
		if(viewNames == buttonClicked) {
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("Bob Banders");
			list.add("Sandy Summers");
			list.add("Greg Ganders");
			list.add("Donny Doners");
			JOptionPane.showMessageDialog(null, list);
		}
	}
}


