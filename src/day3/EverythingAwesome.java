package day3;

import javax.swing.JOptionPane;

public class EverythingAwesome {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your favorite thing");
	JOptionPane.showMessageDialog(null, answer + " is awesome");
}
}
