package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot brah = new Robot();
		
brah.penDown();
		
brah.setSpeed(10);
		
for (int i = 0; i < 360; i++) {
				
	brah.setRandomPenColor();			
	brah.move(2*i);
	brah.turn(1);
	brah.setPenWidth(i);
	
}

brah.hide();

	}
}
