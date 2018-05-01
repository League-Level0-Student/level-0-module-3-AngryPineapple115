package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot bob = new Robot();

	public static void main(String[] args) {
		
		bob.setSpeed(100);
		bob.setPenWidth(22);
		bob.penDown();
		drawSquare();
		bob.penUp();
		bob.move(120);
		bob.penDown();
		drawTriangle();
		bob.penUp();
		bob.move(-215);
		bob.penDown();
		drawCircle();
		bob.hide();
		bob.clear();

		String shape = JOptionPane.showInputDialog("What shape do you want the robot to draw?");
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw with?");
		if (color.equals("Red")) {
			bob.setPenColor(Color.RED);
		}
		if (color.equals("Orange")) {
			bob.setPenColor(Color.ORANGE);
		}
		if (color.equals("Yellow")) {
			bob.setPenColor(Color.YELLOW);
		}
		if (color.equals("Green")) {
			bob.setPenColor(Color.GREEN);
		}
		if (color.equals("Blue")) {
			bob.setPenColor(Color.BLUE);
		}
		if (color.equals("Black")) {
			bob.setPenColor(Color.BLACK);
		}
		if (color.equals("Pink")) {
			bob.setPenColor(Color.PINK);
		}
		if (color.equals("White")) {
			bob.setPenColor(Color.WHITE);
		}
		bob.show();
		if (shape.equals("Square")) {
			drawSquare();
		}
		if (shape.equals("Triangle")) {
			drawTriangle();
		}
		if (shape.equals("Circle")) {
			drawCircle();
		}
	}

	private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			bob.move(100);
			bob.turn(90);
		}
	}

	private static void drawTriangle() {
		for (int e = 0; e < 3; e++) {
			bob.move(100);
			bob.turn(120);
		}
	}

	private static void drawCircle() {
		for (int o = 0; o < 180; o++) {
			bob.move(2);
			bob.turn(2);
		}
	}
}
