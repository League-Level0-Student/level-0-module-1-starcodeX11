package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

			// 1. Save something remarkable about each person in a variable.
		String Romy="dancing Queen";
		String Lindsey="Coding"; 
		String Katie="Gardening";
		String Rocky="Hunter";
		String Calvin="Like a  kitten";
			// 2. Ask the user to enter a name. Store their answer in a variable.
		String NamE = JOptionPane.showInputDialog("What is your name?");
			// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(NamE.equalsIgnoreCase("Romy")) {
			System.out.println("I found Romy.");
			JOptionPane.showMessageDialog(null, Romy);
		}
		
		if(NamE.equalsIgnoreCase("Lindsey")) {
			JOptionPane.showMessageDialog(null, Lindsey);
		}
		if(NamE.equalsIgnoreCase("Katie")) {
			JOptionPane.showMessageDialog(null, Katie);
		}
		if(NamE.equalsIgnoreCase("Rocky")) {
			JOptionPane.showMessageDialog(null, Rocky);
		}
		if(NamE.equalsIgnoreCase("Calvin")) {
			JOptionPane.showMessageDialog(null, Calvin);
		}
	}
}

