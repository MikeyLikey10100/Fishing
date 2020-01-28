import java.util.Scanner;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Greeting
{
		public static void greeting()
		{
			Scanner userInput = new Scanner (System.in);
			Scanner userInput1 = new Scanner (System.in);
			Scanner userInput2 = new Scanner (System.in);
			
			JOptionPane.showMessageDialog(null , "Hello, welcome to fishing. Where you become a pro fishermen. What is your name?");
			
			String name = JOptionPane.showInputDialog(null,null);
	
			JOptionPane.showMessageDialog(null , "Hello " + name + ". Welcome to Fishing.");
			
			JOptionPane.showMessageDialog(null ,"Would you like the rules? ( yes or no)");
			
			String rules = JOptionPane.showInputDialog(null,null);
	
			if( rules.equals("yes"))
				{
					JOptionPane.showMessageDialog(null, "Ok, this is how the game works!");
			
					JOptionPane.showMessageDialog(null,"You will be choosing a bait that you would want to use. ");
			
					JOptionPane.showMessageDialog(null,"Then you cast the rod and wait for a fish!");
				
					JOptionPane.showMessageDialog(null,"Its that easy!");
			
					JOptionPane.showMessageDialog(null,"Ready to play(yes or no). If not you can continue to read the instructions.");
					
					String ready = JOptionPane.showInputDialog(null,null);
					
					if (ready == "yes")
					{
						JOptionPane.showMessageDialog(null,"Ok, Lets get started");
					}
				
				}
			
			else
				{
					JOptionPane.showMessageDialog(null,"Ok, let's get started");
				}
			
		}
	}
