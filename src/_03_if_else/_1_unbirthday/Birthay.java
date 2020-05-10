package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Birthay {
	public static void main(String[] args) { 
	String Birthay = JOptionPane.showInputDialog("enter your Birthay");
	if(Birthay.equals("05/10/2020")){
	JOptionPane.showMessageDialog(null, "Happy Birthay!");
	
	
	}
	else{JOptionPane.showInputDialog ("Happy Unbirthay!");}	
	}

}
