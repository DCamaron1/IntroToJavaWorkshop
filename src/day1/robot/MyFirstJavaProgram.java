package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot buddy = new Robot();
		buddy.setSpeed(100);
		buddy.penDown();
		buddy.setPenWidth(20);
		for (int i = 0; i < 4; i++) {
			buddy.turn(-90);
			buddy.move(200);
		}
//		 buddy.penUp();
//		 buddy.turn(-90);
//		 buddy.move(50);
//		 buddy.penDown();
//		 buddy.setPenColor(000, 051, 221);
//		
//		 buddy.hide();

	}
}
