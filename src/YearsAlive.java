import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {

		int alive = 2006;

		for (int age = 0; age < 13; age++) {

			JOptionPane.showMessageDialog(null, alive);
			alive++;
		}

	}
}
