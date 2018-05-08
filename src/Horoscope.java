import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {

		String sign = JOptionPane.showInputDialog("What is your star sign?");

		if (sign.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Energy from Mercury in sextile "
					+ "with The Moon today helps you to be honest with "
					+ "those close to you.");
		}
		else if (sign.equals("Taurus")) {
	JOptionPane.showMessageDialog(null, "With The Sun in opposition "
			+ "with Jupiter today you can access your inner wisdom "
			+ "regarding your income.");
}
		else if (sign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "As Venus ends its time "
					+ "square with Neptune today youll need to curb"
					+ " your desire for the fine things.");
		}
		else if (sign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Worrying about money "
					+ "won't help you, so put aside your emotions and "
					+ "find practical ways to deal with things.");
		}
		else if (sign.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Secrets surrounding "
					+ "your home life will come out in the end, so "
					+ "be up front now and don't hide things.");
		}
		else if (sign.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "When you hit some pressure "
					+ "today make sure you have a plan A and a plan B, "
					+ "and present them with confidence.");
		}
		else if (sign.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "When you experience "
					+ "a deep connection with someone today, share "
					+ "your creative ideas with them.");
		}
		else if (sign.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Energy from Jupiter "
					+ "in opposition with The Sun today is pushing "
					+ "you to tackle loneliness.");
		}
		else if (sign.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Don't let your emotions "
					+ "take over today, work hard on maintaining logic "
					+ "and break through your fog.");
		}
		else if (sign.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Use your confidence "
					+ "to attract good financial opportunities "
					+ "your way, and you might also make a friend.");
		}
		else if (sign.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "As Neptune ends its "
					+ "time square with Venus today, youll be able to "
					+ "plan for your financial future.");
		}
		else if (sign.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
