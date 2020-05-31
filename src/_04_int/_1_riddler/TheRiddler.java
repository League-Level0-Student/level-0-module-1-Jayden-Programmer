package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0; 
 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Answer = JOptionPane.showInputDialog(null, "Would you rather drink water or would you rather drink milk?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(Answer.equals("Milk")){
		JOptionPane.showMessageDialog(null, "Correct!");
			score += 10; 
		}
		else{
			JOptionPane.showMessageDialog (null,"Wrong the answer was Milk");
	    }
		
		String theAnswer = JOptionPane.showInputDialog(null, "You are going into a haunted house without any electricity, you venture in and you got everything you need.\n There are three doors that lead you to the exit one has an electrical chair,\n one has a lion, and one has a crossbow that will instanly shoot you when you go in,\n which door do you choose?");
		if(theAnswer.equals("door1")){
		JOptionPane.showMessageDialog(null, "Correct!");
		 score += 10; 
		}
		else{JOptionPane.showMessageDialog (null, "Incorrect");
		}
		String Answer2 = JOptionPane.showInputDialog(null, "Which is better Fortnite or Minecraft?");
		if(Answer2.equals("Fortnite")){
		JOptionPane.showMessageDialog(null, "Correct");
		score += 10; 
		}
		else{JOptionPane.showMessageDialog(null, "Incorrect");
		}	
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}		
	}
	    
