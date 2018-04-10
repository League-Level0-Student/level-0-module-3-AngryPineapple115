
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(25);
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenWidth(20);
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.turn(90);
		for (int i = 0; i < 8; i++) {
			for (int e = 0; e < 5; e++) {
				rob.move(30);
				rob.turn(-72);
				rob.move(30);
				rob.turn(144);
			}
			rob.penUp();
			rob.move(110);
			rob.setRandomPenColor();
			rob.penDown();
		}
		rob.hide();
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
