package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	static Robot bob = new Robot();

	public static void main(String[] args) {
		
		bob.setSpeed(50);
		bob.penDown();
		bob.setPenWidth(20);

		String shape = JOptionPane.showInputDialog("Choose a shape.");
		String color = JOptionPane.showInputDialog("In what color?");
		
		if (color.equals("Red")) {
			bob.setPenColor(Color.RED);
		}
		if (color.equalsIgnoreCase("Orange")) {
			bob.setPenColor(Color.ORANGE);
		}
		if (color.equalsIgnoreCase("Yellow")) {
			bob.setPenColor(Color.YELLOW);
		}
		if (color.equalsIgnoreCase("Green")) {
			bob.setPenColor(Color.GREEN);
		}
		if (color.equalsIgnoreCase("Blue")) {
			bob.setPenColor(Color.BLUE);
		}
		if (color.equalsIgnoreCase("Black")) {
			bob.setPenColor(Color.BLACK);
		}
		if (color.equalsIgnoreCase("Pink")) {
			bob.setPenColor(Color.PINK);
		}
		if (color.equalsIgnoreCase("White")) {
			bob.setPenColor(Color.WHITE);
		}
		bob.show();
		if (shape.equalsIgnoreCase("Square")) {
			drawSquare();
		}
		if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		if (shape.equalsIgnoreCase("Circle")) {
			drawCircle();
		}
		
		bob.hide();
		
	}
	
	private static void drawSquare() {
		for (int s = 0; s < 4; s++) {
			bob.move(100);
			bob.turn(90);
		}
	}

	private static void drawTriangle() {
		for (int t = 0; t < 3; t++) {
			bob.move(100);
			bob.turn(120);
		}
	}

	private static void drawCircle() {
		for (int c = 0; c < 180; c++) {
			bob.move(2);
			bob.turn(2);
		}
	}
}
