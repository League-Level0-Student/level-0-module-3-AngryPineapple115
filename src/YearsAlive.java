import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {

		int year = 2006;

		for (int age = 0; age < 13; age++) {

			JOptionPane.showMessageDialog(null, year);
			year++;
		}

	}
}
