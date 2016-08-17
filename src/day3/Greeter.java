package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, answer + " Thats a nice name");
	String answer2 = JOptionPane.showInputDialog("Is the S or the C silent in 'scent'?");
	JOptionPane.showMessageDialog(null, "(-_-) "+answer2 + " really");
	String answer3 = JOptionPane.showInputDialog("What is the answer to life?");
	JOptionPane.showMessageDialog(null, answer3 + " Its 42");
	
}
}
