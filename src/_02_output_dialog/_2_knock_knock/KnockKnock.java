package _02_output_dialog._2_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {	
JOptionPane.showMessageDialog(null,"Knock Knock!");
String answer=JOptionPane.showInputDialog(null,"Who's there?");
JOptionPane.showMessageDialog(null,answer+ " who?");
JOptionPane.showMessageDialog(null, "Nana your business!");
}
}

	//Create a class called KnockKnock.
	//Add a main method.
	//Find your favorite knock-knock joke.
	//Use pop-ups to display each line of the joke:
	//JOptionPane.showMessageDialog(null,"Here is my message");