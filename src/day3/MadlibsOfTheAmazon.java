package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		// Get the user to enter an adjective
		// Get the user to enter a type of liquid
		// Get the user to enter a body part
		// Get the user to enter a verb
		// Get the user to enter a place
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, "You are in a deserted island and have to build a raft lo leave to Los Angles");
String answer = JOptionPane.showInputDialog("please insert a building material");
String answer1 = JOptionPane.showInputDialog("please insert an adjective");
String answer2 = JOptionPane.showInputDialog("insert a verb now");
String answer3 = JOptionPane.showInputDialog("insert an animal");
JOptionPane.showMessageDialog(null, "You are in a deserted island and have to build a raft to go to Los Angeles. \n You say 'Im going to build my raft out of " + answer1 + " " + answer + "'" 
+ "\n" );

	}
}

