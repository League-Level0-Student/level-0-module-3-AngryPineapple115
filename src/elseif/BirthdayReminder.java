
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String mom = "February 10th";
		String dad = "November 25th";
		String self = "October 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		String bday = JOptionPane.showInputDialog("Who's birthday do you want?");
		
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		
		if (bday.equalsIgnoreCase("Mom")) {
			JOptionPane.showMessageDialog(null, mom);
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		
		if (bday.equalsIgnoreCase("Dad")) {
			JOptionPane.showMessageDialog(null, dad);
		}

		
		// 6. if user asked for your name
			// print myBirthday
		
		if (bday.equalsIgnoreCase("Your own")) {
			JOptionPane.showMessageDialog(null, self);
		}

		
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

		else JOptionPane.showMessageDialog(null, "Sorry, I don'r remember that person's birthday.");
		
	} 
}
