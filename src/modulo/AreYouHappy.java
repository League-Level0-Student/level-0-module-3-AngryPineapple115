package modulo;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String original = JOptionPane.showInputDialog("Are you happy?");

		if (original.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else if (original.equals("No")) {
			String second = JOptionPane.showInputDialog("Do you want to be happy?");

			if (second.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever what you're doing.");
			}

			else if (second.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}

		}
	}
}
