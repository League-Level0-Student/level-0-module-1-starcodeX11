package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What has a bottom at the top?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("legs")) {
			JOptionPane.showMessageDialog(null,"CORRECT");
			score++;
		}
		else {
			// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null,"INCORRECT, THE ANSWER IS LEGS");
		}
		
		
		// 6. Add some more riddles
		 answer = JOptionPane.showInputDialog("What is made of water but if you put it into water it will die");
		if(answer.equals("ice cube")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++; 
			}
			
			else {
				JOptionPane.showMessageDialog(null, "INCORRECT, THE ANSWER WAS AN ICE CUBE");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is " + score);
	}

		}
