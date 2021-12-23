package _03_if_else._1_unbirthday;

import java.util.Date;
import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String Bday = JOptionPane.showInputDialog("When is your birthday machine (mm/dd)!");
		System.out.println(Bday);
		
		Date today=new Date ();
		System.out.println(today);
		
		//Date Cake=new Date(Bday);
		//System.out.println(Cake);
		System.out.println(today.getMonth());
		System.out.println(today.getDate());
		String Pre=today.getMonth() + "/" + today.getDate();
		
		if (Bday.equals(Pre)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
		 JOptionPane.showMessageDialog(null, "Happy Unbirthday!");	
		}
	}
}       